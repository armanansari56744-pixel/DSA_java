import java.util.Scanner;

public class Double_LinkedList_deletion {
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
        int choice, pos, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_Node = new Node(data);
            if (head == null) {
                head = new_Node;
                tail = new_Node;
            } else {
                System.out.println("=== Enter choice ===");
                System.out.println("1. At beginning: ");
                System.out.println("2. At end: ");
                System.out.println("3. At specific location: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        new_Node.next = head;
                        head.prev = new_Node;
                        head = new_Node;
                        break;

                    case 2:
                        tail.next = new_Node;
                        new_Node.prev = tail;
                        tail = new_Node;
                        break;

                    case 3:
                        System.out.println("Enter position: ");
                        pos = sc.nextInt();

                        Node temp = head;
                        Node temp1 = temp.next;

                        for (int i = 1; i < (pos - 1); i++) {
                            temp = temp1;
                            temp1 = temp.next;
                        }
                        new_Node.prev = temp;
                        new_Node.next = temp1;
                        temp.next = new_Node;
                        temp1.prev = new_Node;
                        break;

                    default:
                        System.out.println("Invalid choice: ");
                        break;
                }
            }
            System.out.println("Do you want to enter more data press: 7 ");
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
                System.out.println("=== Enter Delete choice === ");
                System.out.println("1. At Beginning: ");
                System.out.println("2. At end: ");
                System.out.println("3. At specific location: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        break;

                    case 2:
                        Node temp1 = tail;
                        temp1 = temp1.prev;
                        temp1.next = null;
                        tail = temp1;
                        break;

                    case 3:
                        System.out.println("Enter location for delete: ");
                        pos = sc.nextInt();

                        Node temp2 = head;
                        Node temp3 = temp2.next;
                        for (int i = 1; i < (pos - 1); i++) {
                            temp2 = temp3;
                            temp3 = temp3.next;
                        }
                        temp2.next = temp3.next;
                        temp3.next.prev = temp2;
                        break;

                    default:
                        System.out.println("Invalid choice: ");
                        break;

                }
            }
            System.out.println("Do you want to delete more data press: 9 ");
            n = sc.nextInt();
        } while (n == 8);
    }
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty: ");

        }else{
            while (temp!=null) {
                System.out.print(temp.data + " <-> ");
                temp= temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Double_LinkedList_deletion dlld= new Double_LinkedList_deletion();

        dlld.insert();
        dlld.delete();
        dlld.display();
    }
}
