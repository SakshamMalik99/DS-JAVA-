import java.util.*;

public class DelEnd {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void insertEnd(int data) {
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
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node slst = head;
            while (slst.next.next != null) {
                slst = slst.next;
            }
            Node lst = slst.next;
            slst.next = null;
            lst = null;
        }
    }

    public static void main(String[] args) {
        DelEnd ob = new DelEnd();
        ob.insertEnd(40);
        ob.insertEnd(50);
        ob.insertEnd(60);
        ob.insertEnd(70);
        System.out.println("List: ");
        ob.display();
        System.out.println("List after deleting from end: ");
        ob.deleteEnd();
        ob.display();
    }
}