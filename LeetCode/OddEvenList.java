class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        ListNode iter = head.next.next;
        ListNode prev = head.next;
        ListNode bound = head;
        while (true) {
            ListNode temp = bound.next;
            ListNode curr = iter.next;
            bound.next = iter;
            iter.next = temp;
            prev.next = curr;
            if (curr == null || curr.next == null)
                return head;
            iter = curr.next;
            prev = curr;
            bound = bound.next;
        }
    }
}