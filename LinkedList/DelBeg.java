import java.util.*;

public class DelBeg {

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

    public void deleteBeg() {
        if (head == null) {
            System.out.println("LIst is empty");
        } else {
            Node temp = head;
            head = head.next;
            temp = null;
        }

    }

    public static void main(String[] args) {
        DelBeg ob = new DelBeg();
        ob.insertEnd(40);
        ob.insertEnd(50);
        ob.insertEnd(60);
        ob.insertEnd(70);
        System.out.println("List: ");
        ob.display();
        System.out.println("List after deleting from begining: ");
        ob.deleteBeg();
        ob.display();
    }
}