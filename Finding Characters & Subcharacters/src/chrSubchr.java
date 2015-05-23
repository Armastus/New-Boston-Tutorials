
public class chrSubchr {
	public static void main (String[] args) {
		
		String palindrome = "A dog, a plan, a canal: pagoda.";
		//'indexOf' command searches for the first instance of a character.
		//so after 9 characters is where "p" begins.
		System.out.println(palindrome.indexOf('p'));
		
		//this will search for the first indexOf 'p' but ignore the
		//first 12 characters, so 24.
		System.out.println(palindrome.indexOf('p', 12));
		
		//search the indexOf a sub-string.
		System.out.println(palindrome.indexOf("nal: pa"));
		
		//search the indexOf a sub-string and ignore the first 9 characters,
		//so 11.
		System.out.println(palindrome.indexOf("an", 9));
		
		stringsCont object = new stringsCont();
		object.stringsSir();
	}
}
