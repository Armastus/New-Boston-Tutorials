public class stringOccurance { 
	//Turn each string into a char[], sort that array, then compare the two.
	 String[] firstStr = {"aabca"};
	 String[] secondStr = {"aabcdaabcaabcaded"};
	 public void compareStr() {
		for(String str1 : firstStr){	
			for (String str2 : secondStr){
				if(str2.contains(str1))
				System.out.println(str2 + " contains aabca");
			}
		}
		
		String firstStr = "aabca";
		String secondStr = "aabcdaabcaabcaded";
		int ii = 0;
		//use a while loop to go through each character of the secondStr
		//until it reaches the end and each time it finds a match
		//to the firstStr print the "indexOf" the starting point.
		while ((ii = (secondStr.indexOf(firstStr, ii) + 1)) > 0)
			System.out.println(ii);
		}
	}
			