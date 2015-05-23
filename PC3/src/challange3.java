
public class challange3 {
	public static void main (String[] args) {
		InterviewQs functions = new InterviewQs();
		/*Class method to replace a specific character 
		in a given string with a given character.*/
		char word[] = {'e', 'l', 'e', 'p', 'h', 'a', 'n', 't'};
		
		/*Each instance of the first letter given is to be replaced by
		the second letter given.*/
		functions.charSwap(word, 'e', 'a');
		System.out.println(word);
	}
}
