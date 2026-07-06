public class BreakStatement {
 	public static void main(String args[]) {
     	for(int i = 1; i <= 10; i++) {
         	// terminate the loop if i is 5.
         	if(i == 5)
            	break;
         	System.out.print(i + " ");
     	}
  	}
}