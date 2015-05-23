
public class challange4 {
	public static void main(String[] args) {
		InterviewQs functions = new InterviewQs();
		
		/* Class method to check, and correct, "i before e except after c." */
		/* The method should return 'true' if a change was needed, and 'false' otherwise. */
		/* Don't worry about bounds checking. A simplistic approach is fine. */
		
		char grammar1[] = {'r', 'e', 'c', 'i', 'e', 'v', 'e'};
		char grammar2[] = {'r', 'e', 'c', 'i', 'e', 'p', 't'};
		char grammar3[] = {'r', 'a', 'c', 'c', 'o', 'o', 'n'};
		
		if (functions.iBeforeE(grammar1) == true) {
			System.out.print(grammar1);
			System.out.println(" now follows the rule.");
		}
		
		if (functions.iBeforeE(grammar2) == true) {
			System.out.print(grammar2);
			System.out.println(" now follows the rule.");
		}
		
		if (functions.iBeforeE(grammar3) == false) {
			System.out.print(grammar3);
			System.out.println(" is fine...");
		}
	}
}
