import java.util.Scanner;

public class Single_LinkedList_Insertion {
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
        int n, choice, x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
               System.out.println("====Insertion====");
               System.out.println("1. insert at beginnig: ");
               System.out.println("2. Insert at end: ");
               System.out.println("3. Insert at  specific position: ");
                 choice= sc.nextInt();

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
                        System.out.println("Enter position to enter data: ");
                        x = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (x - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                }
            }
            System.out.println("you want to enter more data in List press: 7");
            n = sc.nextInt();
        } while (n == 7);

    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty: ");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Single_LinkedList_Insertion lli = new Single_LinkedList_Insertion();

        lli.insert();
        lli.display();
    }
}
