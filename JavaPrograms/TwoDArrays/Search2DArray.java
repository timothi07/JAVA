package TwoDArrays;
import java.util.Scanner;

public class Search2DArray {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();
        }

        //Searching
        System.out.println("Enter the number to be searched: ");
        int key = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                if (key == arr[i][j]){
                    System.out.println("Index of " + key + "is [" + i +"][" + j +"]");
                    flag = 1;
                    System.exit(0);
                }
            }
        }
        if(flag == 0)
            System.out.println(-1);

        sc.close();
    }
}
