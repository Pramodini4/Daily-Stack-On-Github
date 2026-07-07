//package Jump Statements;

public class LabeledBreak {
    public static void main(String args[]) {
		boolean b = true;
		// first label
		first: {
			// second label
			second: {
				// third label
				third: {
					System.out.println("Before the break statement");
					// break will take the control out 
					// of the second label
					if(b)
						break second;
					System.out.println("This would not be execute");
				}
				System.out.println("This would not be execute");
			}
				System.out.println("This is after the second block");
		}
	}
}
