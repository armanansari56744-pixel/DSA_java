import java.util.Scanner;

public class Circular_Linkedlist_deletion {
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
        int choice, n, pos;
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
                System.out.println(" ===Insertion=== ");
                System.out.println("1. At beginnig: ");
                System.out.println("2. At End: ");
                System.out.println("3. At specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        new_Node.next = head;
                        head = new_Node;
                        tail.next = head;
                        break;

                    case 2:
                        tail.next = head;
                        tail = new_Node;
                        new_Node.next = head;
                        break;

                    case 3:
                        System.out.println("Enter position to insert: ");
                        pos = sc.nextInt();

                        Node temp = head;
                        for (int i = 0; i < (pos - 1); i++) {
                            temp = temp.next;
                        }
                        new_Node.next = temp.next;
                        temp.next = new_Node;
                        break;

                }
            }
            System.out.println("Do you want to insert more data press: 7 ");
            n = sc.nextInt();
        } while (n == 7);
    }

    public void delete() {
        int choice, pos, n;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("List is empty: ");
            } else {
                System.out.println(" ===Detetion=== ");
                System.out.println("1. From Beginning: ");
                System.out.println("2. From End: ");
                System.out.println("3. From specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (head == tail) {
                            head = null;
                            tail = null;
                        } else {
                            head = head.next;
                            tail.next = head;
                        }
                        break;

                    case 2:
                        Node temp = head;
                        Node ptr = temp.next;

                        while (ptr != head) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = head;
                        break;

                    case 3:
                        System.out.println("Do you want to delete more data press: 9");
                        pos = sc.nextInt();

                        Node temp1 = head;
                        Node temp2 = temp1.next;
                        for (int i = 0; i < (pos - 2); i++) {
                            temp1 = temp2;
                            temp2 = temp2.next;
                        }
                        temp1.next = temp2.next;
                        break;
                }
            }
            System.out.println("Do you want to Delete more data press: 9 ");
            n = sc.nextInt();
        } while (n == 9);
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
            System.out.println("Return to head");
        }
    }

    public static void main(String[] args) {
        Circular_Linkedlist_deletion clld = new Circular_Linkedlist_deletion();

        clld.insert();
        clld.delete();
        ;
        clld.display();
    }
}
