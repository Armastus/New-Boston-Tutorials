
public class stringMethods {
	public static void main (String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		//startsWith
		for (String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w + " Starts with fu");
		}
		//endsWith
				for (String w : words) {
					if(w.endsWith("unk"))
						System.out.println(w + " Ends with unk");
				}
				
				for (String w : words) {
					if(w.contains("un"))
						System.out.println(w + " contains un");
				}
	}
}