import java.util.Scanner;

public class Single_Linkedlist_Delete {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert() {
        int choice, pos, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("====insertion====");
                System.out.println("1. at beginning: ");
                System.out.println("2. at end: ");
                System.out.println("3. at any specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        new_node.next = head;
                        head = new_node;

                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;

                        break;

                    case 3:
                        System.out.println("Enter position to insert data: ");
                        pos = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (pos - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;

                        break;
                }
            }
            System.out.println("you want to insert more data press: 7 ");
            n = sc.nextInt();
        } while (n == 7);
    }

    public void delete() {
        int choice, pos, m;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("List empty: ");
            } else {
                System.out.println("====Deletion===");
                System.out.println("1. from beginning: ");
                System.out.println("2. from end: ");
                System.out.println("3 . from specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        head = head.next;
                        break;

                    case 2:
                        Node temp = head;
                        Node temp1 = temp.next;

                        while (temp1.next != null) {
                            temp = temp1;
                            temp1 = temp1.next;
                        }
                        temp.next = null;
                        break;
                    case 3:
                        System.out.println("Enter position to delete: ");
                        pos = sc.nextInt();

                        Node temp3 = head;
                        Node temp4 = temp3.next;
                        for (int i = 0; i < (pos - 1); i++) {
                            temp3 = temp4;
                            temp4 = temp3.next;
                        }
                        temp3.next = temp4.next.next;
                }
            }
            System.out.println("you want to delete more data press: 8 ");
            m = sc.nextInt();
        } while (m == 8);
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List empty: ");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Single_Linkedlist_Delete slld = new Single_Linkedlist_Delete();

        slld.insert();
        slld.delete();
        slld.display();
    }
}
