public class reverseString {
	public static void main(String[] args) {
		String original = "Ignore Me!";
		
		for(int ii = original.length()-1; ii >= 0; ii--){
			String reverse = "";
			reverse = reverse + original.charAt(ii);

			System.out.printf(reverse);
		}
	}
}
