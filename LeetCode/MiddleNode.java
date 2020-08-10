class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int countNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            countNodes++;
            temp = temp.next;
        }
        int middle = (countNodes / 2);
        int i = 0;
        while (i++ < middle) {
            head = head.next;
        }
        return head;
    }
}