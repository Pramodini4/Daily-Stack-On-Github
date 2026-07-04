public class JavaNestedIf {
   public static void main(String args[]) {
      int a = 20;
     
      if(a == 20) {


         // First if statement
         if(a < 25)
            System.out.println("a is smaller than 25");


         // Nested if statement, it will execute
         // only when the above if-statement is true.
         if(a < 22)
            System.out.println("a is smaller than 22 too");
         else
              System.out.println("a is greater than 25");
      }
   }
} 
