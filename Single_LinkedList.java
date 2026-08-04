import java.util.Scanner;

public class Single_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insert() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("do you want to insert more data press: 1 ");
            n = sc.nextInt();
        } while (n == 1);
    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty: ");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Single_LinkedList ll = new Single_LinkedList();
        ll.insert();
        ll.display();
    }



    // static class Node{
    //     int data; 
    //     Node next;

    //     Node(int data){
    //         this.data = data;
    //         this.next= null;
    //     }
    // }
    // Node head = null;

    // void insert(int data){
    //     Node new_node=  new Node(data);
    //     if(head == null){
    //         head= new_node;
    //     }else{
    //         new_node.next= head;
    //         head= new_node;
    //     }
    // }
    // void display(){
    //     Node temp = head;

    //     if(head == null){
    //         System.out.println("List is empty: ");
    //     }else{
    //         while (temp != null) {
    //             System.out.print(temp.data + " -> ");
    //             temp = temp.next;
    //         }
    //         System.out.println("null");
    //     }
    // }
    // public static void main(String[] args) {
    //    Single_LinkedList ll = new Single_LinkedList();
    //     ll.insert(10);
    //     ll.insert(20);
    //     ll.insert(30);
    //     ll.insert(40);
    //     ll.insert(60);
    //     ll.insert(70);
    //     ll.insert(80);
    //     ll.insert(90);

    //     ll.display();
    // }
}
