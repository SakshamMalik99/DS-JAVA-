class NextLargerNode {
    public int[] nextLargerNodes(ListNode head) {
        int[] res = new int[10000];
        Stack<int[]> stack = new Stack<int[]>();
        int p = 0;
        while (head != null) {
            int v = head.val;
            while (!stack.isEmpty() && stack.peek()[0] < v) {
                res[stack.peek()[1]] = v;
                stack.pop();
            }
            stack.push(new int[] { v, p++ });
            head = head.next;
        }
        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            res[node[1]] = 0;
        }
        return Arrays.copyOfRange(res, 0, p);
    }
}