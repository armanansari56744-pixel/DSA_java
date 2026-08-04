import java.util.Scanner;

//                      Delete array by index                                          

public class Delete_element_Array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter array size: ");
        // int size = sc.nextInt();

        // int arr1[] = new int[size];
        // int arr2[] = new int[size - 1];

        // System.out.println("Enter array element: ");
        // for (int i = 0; i < size; i++) {
        //     arr1[i] = sc.nextInt();
        // }

        // System.out.println("Enter index you want to delete: ");
        // int index = sc.nextInt();
        // for (int i = 0; i < size - 1; i++) {
        //     if (i < index) {
        //         arr2[i] = arr1[i];
        //     } else {
        //         arr2[i] = arr1[i + 1];
        //     }
        // }
        // System.out.println();
        // for (int i = 0; i < size - 1; i++) {
        //     System.out.print(arr2[i] + " ");
        // }
        // sc.close();
    


    //      Delete  Arry element by element 

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size: ");
    int size = sc.nextInt();

    int arr1[] = new int[size];
    int arr2[] = new int[size - 1];

    System.out.println("Enter array element: ");
    for (int i = 0; i < size; i++) {
    arr1[i] = sc.nextInt();
    }

    System.out.println("Enter element you want to delete: ");
    int element = sc.nextInt();

    int index = -1;
    for (int i = 0; i < size; i++) {
    if (arr1[i] == element) {
    index = i;
    break;
    }
    }
    if(index == -1){
    System.out.println("Element not found: ");
    return;
    }

    for (int i = 0; i < size - 1; i++) {
    if (i < index) {
    arr2[i] = arr1[i];
    } else {
    arr2[i] = arr1[i + 1];
    }
    }
    System.out.println();
    for (int i = 0; i < size - 1; i++) {
    System.out.print(arr2[i] + " ");
    }
    sc.close();

    }
}
