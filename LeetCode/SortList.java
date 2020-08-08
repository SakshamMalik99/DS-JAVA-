class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pivot = head;
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode l = less;
        ListNode p = pivot;
        ListNode m = more;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val < pivot.val) {
                l.next = cur;
                l = l.next;
            } else if (cur.val == pivot.val) {
                p.next = cur;
                p = p.next;
            } else {
                m.next = cur;
                m = m.next;
            }
            cur = cur.next;
        }
        p.next = null;
        l.next = null;
        m.next = null;
        ListNode lessSorted = sortList(less.next);
        ListNode moreSorted = sortList(more.next);
        if (lessSorted != null) {
            l = lessSorted;
            while (l.next != null) {
                l = l.next;
            }
            l.next = pivot;
            p.next = moreSorted;
            return lessSorted;
        } else {
            p.next = moreSorted;
            return pivot;
        }
    }
}