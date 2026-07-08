//package Functions in java;
import java.util.Scanner;
public class FindSum {
    public static int findSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){
        // int a = 10;
        // int b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = findSum(a,b);
        System.out.println("Sum:" + c);
    }
}
