class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pointer = null;
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = null;
        while (p1 != null || p2 != null) {
            ListNode temp = null;
            if (p1 == null) {
                temp = new ListNode(p2.val);
                p2 = p2.next;
            } else if (p2 == null) {
                temp = new ListNode(p1.val);
                p1 = p1.next;
            } else if (p1.val < p2.val) {
                temp = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                temp = new ListNode(p2.val);
                p2 = p2.next;
            }
            if (pointer == null) {
                pointer = temp;
            } else {
                pointer.next = temp;
                pointer = temp;
            }
            if (result == null) {
                result = temp;
            }
        }
        return result;
    }
}