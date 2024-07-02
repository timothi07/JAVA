package Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements to be inserted: ");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int flag = 0;
        for (int i = 0; i < size; i++){
            if(arr[i] == key){
                System.out.println("The index of element " + key + " is: " + i);
                flag = 1;
                break;
            }
        }
        if (flag != 1)
            System.out.println("The element " + key + " not found in the array");
        
        sc.close();

    }
}
