//package Jump Statements;

public class ContinueStatement {
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++) {
            // using continue statement
            // skip the value when i is 3
            if(i == 3)
                continue;
             
            // Printing the value
            System.out.print(i + " ");
        }
    }
}
