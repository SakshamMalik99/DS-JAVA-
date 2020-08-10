class NumComponents {
    public int numComponents(ListNode head, int[] G) {
        int count = 0;
        ListNode node = head;
        int length = 0; // find N

        while (node != null) {
            length++;
            node = node.next;
        }
        boolean[] present = new boolean[length];
        for (int i = 0; i < G.length; i++) {
            present[G[i]] = true;
        }
        node = head;
        boolean found = false;
        while (node != null) {
            int val = node.val;
            if (!found && present[val]) {
                found = true;
            } else if (found && !present[val]) {
                found = false;
                count++;
            }
            node = node.next;
        }
        return (found) ? count + 1 : count;
    }
}