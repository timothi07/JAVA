package TwoDArrays;
import java.util.Scanner;
public class TwoDArrayBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Printing the array
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
