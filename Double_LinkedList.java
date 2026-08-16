import java.util.Scanner;

public class Double_LinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert() {
        int n, choice, pos;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {

                head = new_node;
                tail = new_node;
            } else {
               head.prev = new_node;
               new_node.next = head;
               head= new_node;
            }
            System.out.println("Do you want to add more data press: 7 ");
            n = sc.nextInt();
        } while (n == 7);
    }

    public void display() {
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty: ");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Double_LinkedList dll = new Double_LinkedList();

        dll.insert();
        dll.display();
    }

    // static class Node {
    // int data;
    // Node next;
    // Node prev;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // this.prev = null;
    // }
    // }

    // Node head = null;
    // Node tail = null;

    // public void insert(int data) {
    // //

    // Node new_node = new Node(data);
    // if (head == null) {

    // head = new_node;
    // tail = new_node;
    // } else {
    // head.prev = new_node;
    // new_node.next = head;
    // head = new_node;
    // }
    // }

    // public void display() {
    // Node temp = head;

    // if (head == null) {
    // System.out.println("List is empty: ");
    // } else {
    // while (temp != null) {
    // System.out.print(temp.data + " <-> ");
    // temp = temp.next;
    // }
    // System.out.println("null");
    // }
    // }

    // public static void main(String[] args) {
    // Double_LinkedList_insertion dll = new Double_LinkedList_insertion();

    // dll.insert(10);
    // dll.insert(20);
    // dll.insert(30);
    // dll.insert(40);
    // dll.insert(50);
    // dll.insert(60);
    // dll.insert(70);
    // dll.insert(80);

    // dll.display();
    // }

}
