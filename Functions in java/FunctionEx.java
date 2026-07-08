import java.util.Scanner;
public class FunctionEx {
    public static int max(int x,int y){
        if(x > y)
            return x;
        else
            return y;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        // int a = 10;
        // int b = 20;

        int maximum = max(a,b);
        System.out.println("Maximum no");
        System.out.println(maximum);
    }
}
