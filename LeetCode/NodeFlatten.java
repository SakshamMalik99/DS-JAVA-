class NodeFlatten {
    public Node flatten(Node head) {
        Stack<Node> s = new Stack<>();
        Node t = head;
        while (t != null) {
            if (t.child != null) {
                if (t.next != null)
                    s.push(t.next);
                t.next = t.child;
                t.child.prev = t;
                t.child = null;
                t = t.next;
            } else if (t.next != null) {
                t = t.next;
            } else if (!s.isEmpty()) {
                Node next = s.pop();
                t.next = next;
                next.prev = t;
                t = next;
            } else {
                t = null;
            }
        }
        return head;
    }
}