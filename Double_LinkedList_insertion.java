import java.util.Scanner;

public class Double_LinkedList_insertion {
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
                System.out.println("=== Enter choice===");
                System.out.println("1. At beginning: ");
                System.out.println("2. At End: ");
                System.out.println("3. At specific Location: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;

                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;

                    case 3:
                        System.out.println("Enter position: ");
                        pos = sc.nextInt();

                        Node temp = head;
                        Node temp1 = temp.next;
                        for(int i =1 ;i<(pos-1); i++){
                            temp = temp1;
                            temp1= temp.next;
                        }
                        new_node.prev = temp;
                        new_node.next= temp1;
                        temp.next = new_node;
                        temp1.prev= new_node;
                        break;

                    default:
                        System.out.println("Invalid choice :");
                        break;
                }
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
        Double_LinkedList_insertion dll = new Double_LinkedList_insertion();

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
