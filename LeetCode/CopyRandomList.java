class CopyRandomList {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node fake = new Node(0);
        Node cur = fake;
        while (head != null) {
            cur.next = new Node(head.val);
            cur = cur.next;
            cur.random = head.random;
            map.put(head, cur);
            head = head.next;
        }
        cur = fake;
        while (cur != null) {
            if (cur.random != null) {
                cur.random = map.get(cur.random);
            }
            cur = cur.next;
        }
        return fake.next;
    }
}