//package Problems;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String args[]) {
		
		// Write code here
		int no;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
		no = sc.nextInt();
		if(no<0){
			System.out.println("Error");
		}
		else{
			long factorial = 1;
			for(int i=1; i<= no; i++){
				factorial *= i;
			}
			System.out.println(factorial);
		}
		
	}
}
