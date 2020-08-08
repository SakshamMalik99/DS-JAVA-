class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode curr = head;
        ListNode prev = dummy;
        while (curr != null) {
            if (prev.val > curr.val) {
                prev = dummy;
            }
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            ListNode temp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = temp;
        }
        return dummy.next;
    }
}