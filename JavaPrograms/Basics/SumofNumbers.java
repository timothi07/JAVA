import java.util.Scanner;
//Program to print sum of first n natural numbers
public class SumofNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++){
            sum += i;
        }
        System.out.println("The sum of first "+ n +" natural numbers is: "+ sum);

        sc.close();
    }
}
