//package Jump Statements;

public class ContinueWithNested {
     public static void main(String args[]) {
        // outer for loop
        for(int i = 1; i <= 3; i++) {
            // inner for loop
            for(int j = 1; j <= 3; j++) {
                // continue statement inside the inner loop
                // to skip the current iteration when
                // i == 2 and j == 2
                
                if(i == 2 && j == 2) {
                    continue;
                } 
                System.out.println(i + " " + j);
            }
        }
    }
}
