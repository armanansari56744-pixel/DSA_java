import java.util.Scanner;

public class Insert_element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size + 1];

        System.out.println("Enetr array element: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter index where you want to insert: ");
        int index = sc.nextInt();
        System.out.println("Enter element you want to insert: ");
        int element = sc.nextInt();

        for (int i = 0; i < size + 1; i++) {
            if (i < index) {
                arr2[i] = arr1[i];
            } else if (i == index) {
                arr2[i] = element;
            } else {
                arr2[i] = arr1[i - 1];
            }
        }
        System.out.println();
        for (int i = 0; i < size + 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
