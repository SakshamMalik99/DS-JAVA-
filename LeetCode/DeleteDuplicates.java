class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode previous = temp;
        ListNode current = temp.next;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                while (current.next != null && current.val == current.next.val)
                    current = current.next;
                current = current.next;
                previous.next = current;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return temp.next;
    }
}