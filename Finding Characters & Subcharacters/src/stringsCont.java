
public class stringsCont {
		
	public void stringsSir(){
		String a = "Bacon";
		String b = "    monster             ";
		
		//'concat' joins two strings.  so
		//the output would be "Bacon monster".
		System.out.println(a.concat(b));
		
		
		//'replace' will replace a character with another.
		System.out.println(a.replace('B', 'F'));
		
		//'toUpperCase' will capitalize Bacon to BACON.
		//'toLowerCase' does the same.
		System.out.println(a.toUpperCase());
		
		//'.trim' will remove white space
		System.out.println(a.concat(b.trim()));
	}
	
}
