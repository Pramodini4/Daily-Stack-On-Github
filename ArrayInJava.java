import java.util.Scanner;
public class ArrayInJava{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i = 0; i <= 3; i++){
            marks[i] = sc.nextInt();
        } 
        for(int i =0; i<=3; i++){
            System.out.println("Marks " + i + " = " +marks[i]);
        } 
    }
    
    
}