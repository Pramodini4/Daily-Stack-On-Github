import java.util.Scanner;
public class SumOfEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        
        System.out.println("Enter number:");
        int no = sc.nextInt();

        while(no > 0){
            int digit = no % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            }
            else{
                oddSum += digit;
            }
            no = no / 10;
        }
        System.out.println(evenSum +" "+ oddSum);
    }
}
