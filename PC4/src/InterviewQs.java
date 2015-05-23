
public class InterviewQs {
	public boolean iBeforeE(char[] word){

		for(int x = 0; x <= word.length; x++){
			if (word[x] == 'c'){
				if(word[x+1] == 'i')
					if(word[x+2] == 'e')
						word[x+1] = 'e';
						word[x+2] = 'i';
						return true;
			}
		}
		return false;
	}	
}	


