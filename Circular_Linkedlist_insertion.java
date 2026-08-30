import java.util.Scanner;

public class Circular_Linkedlist_insertion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert() {
        int choice, pos, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_Node = new Node(data);
            if (head == null) {
                head = new_Node;
                tail = new_Node;
                new_Node.next = head;
            } else {
                System.out.println("---Insertion---");
                System.out.println("1. At beginning: ");
                System.out.println("2. At end: ");
                System.out.println("3. At specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        new_Node.next = head;
                        head = new_Node;
                        tail.next = head;
                        break;

                    case 2:
                        tail.next = new_Node;
                        tail = new_Node;
                        new_Node.next = head;
                        break;

                    case 3:
                        System.out.println("Enter position to insert data: ");
                        pos = sc.nextInt();

                        Node temp = head;
                        for (int i = 1; i < (pos - 1); i++) {
                            temp = temp.next;
                        }
                        new_Node.next = temp.next;
                        temp.next = new_Node;
                        break;

                    default:
                        System.out.println("Invalid choice: ");
                        break;

                }
            }
            System.out.println("Do you want insert more data press: 7 ");
            n = sc.nextInt();
        } while (n == 7);
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty: ");
        } else {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("Back to Head: ");
        }
    }

    public static void main(String[] args) {
        Circular_Linkedlist_insertion clli = new Circular_Linkedlist_insertion();

        clli.insert();
        clli.display();
    }
}
