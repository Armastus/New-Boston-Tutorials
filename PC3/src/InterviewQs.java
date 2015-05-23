
public class InterviewQs {
	public void charSwap(char word[], char ltr1, char ltr2) {
		
		for (int x = 0; x < word.length; x++){
			//If a character in this array equals ltr1, then replace it with ltr2!
			if(word[x] == ltr1){
				word[x] = ltr2;
			}
		}
	}
}
