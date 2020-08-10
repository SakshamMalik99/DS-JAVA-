class RemoveZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum = 0;
        map.put(0, dummy);
        while (head != null) {
            sum += head.val;
            if (map.containsKey(sum)) {
                ListNode rem = map.get(sum).next;
                int sum2 = sum;
                while (rem != head) {
                    sum2 += rem.val;
                    map.remove(sum2);
                    rem = rem.next;
                }
                map.get(sum).next = head.next;

            } else {
                map.put(sum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}