class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode h = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode next = slow.next;
        slow.next = null;
        slow = next;
        ListNode l1 = h;
        ListNode l2 = reverse(slow);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l2 != null) {
            cur.next = l1;
            l1 = l1.next;
            cur = cur.next;
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            cur.next = l1;
            l1 = l1.next;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}