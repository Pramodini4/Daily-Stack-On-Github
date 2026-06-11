import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        a = sc.nextInt();
        System.out.println("Enter B:");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped no:");
        System.out.println("a = "+a+ "\nb = "+b);
    }
}
