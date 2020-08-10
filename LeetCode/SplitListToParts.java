class SplitListToParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode temp = root;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        temp = root;
        int parts = len / k;
        int rem = len % k;
        ListNode[] res = new ListNode[k];
        if (root == null)
            return res;
        for (int i = 0; i < k; i++) {
            ListNode newNode = new ListNode(-1);
            ListNode ptr = newNode;
            int iter = parts;
            if (rem >= 1) {
                iter += 1;
                rem--;
            }
            while (temp != null && iter > 0) {
                ptr.next = temp;
                temp = temp.next;
                ptr = ptr.next;
                iter--;
            }
            ptr.next = null;
            res[i] = newNode.next;
        }
        return res;
    }
}