class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        k = k % count;
        count = count - k;
        temp = head;
        ListNode first = dummy, second = dummy;
        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        for (int i = 0; i < count; i++) {
            second = second.next;
            first = first.next;
        }
        first.next = head;
        dummy.next = second.next;
        dummy = dummy.next;
        second.next = null;
        head = dummy;
        return head;
    }
}