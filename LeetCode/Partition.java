class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode lLHead = new ListNode(0), lLIter = lLHead;
        ListNode gLHead = new ListNode(0), gLIter = gLHead;
        for (ListNode current = head; current != null; current = current.next) {
            if (current.val < x)
                lLIter = lLIter.next = current;
            else
                gLIter = gLIter.next = current;
        }
        gLIter.next = null;
        lLIter.next = gLHead.next;
        return lLHead.next;
    }
}