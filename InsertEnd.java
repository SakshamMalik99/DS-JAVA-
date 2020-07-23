import java.util.*;

public class InsertEnd {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public void inEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node lst = head;
            while (lst.next != null) {
                lst = lst.next;
            }
            lst.next = temp;
        }
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertEnd ob = new InsertEnd();
        ob.inEnd(40);
        ob.inEnd(50);
        ob.display();
    }
}
