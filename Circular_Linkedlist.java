import java.util.Scanner;

public class Circular_Linkedlist {
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
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
            }
            System.out.println("Do you want to insert more data press: 7 ");
            n = sc.nextInt();
        } while (n == 7);

    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty: ");
        }else{
            do{
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }while(temp!=head);
           System.out.println("return to head"); 
        }
    }
    public static void main(String[] args) {
        Circular_Linkedlist cll = new Circular_Linkedlist();

        cll.insert();
        cll.display();
    }
}
