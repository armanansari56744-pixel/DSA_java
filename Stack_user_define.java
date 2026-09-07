import java.util.Scanner;

public class Stack_user_define {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];
    Scanner sc = new Scanner(System.in);

    public void push(){
        if(top ==(n-1)){
            System.out.println("Overflow ");
        }else{
            System.out.println("Enter data ");
            int data = sc.nextInt();
            top = top +1;
            arr[top] =data;
            System.out.println("Item inserted ");
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Underflow ");
        }else{
            top = top-1;
            System.out.println("Item deleted ");
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty ");
        }else{
            System.out.println("Item are ");
            for(int i =top;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int choice,m;

        Stack_user_define s = new Stack_user_define();

        do{
            System.out.println("1. push item ");
            System.out.println("2. pop item ");
            System.out.println("3 . display ");
            System.out.println("Enter choice ");
            choice = s.sc.nextInt();

            switch (choice) {
                case 1:
                    s.push();
                    break;
            
                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;
                
            }
            System.out.println("Press 0 to return in Menu");
            System.out.println("Press other key for exit ");
            m = s.sc.nextInt();
        }while(m==0);
        System.out.println("Exit successfully ");
    }

}
