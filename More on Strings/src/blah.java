
public class blah {
	public static void main(String[] args) {
		
		String a = "apples!";
		String b = "bucky";
		String c = "BUCKY";
		String s = "asdlkjsdljsdfasdfasdfjbandggjka";
		System.out.println(s.indexOf('b'));
		System.out.println(a.length());
		
		//'equales' compares the contents of a string to the variable.
		if(a.equals("apples!")){
			System.out.println("It equals apples!");
		}
		if(b.equals(a)){
			System.out.println("It equals bucky");
		}
		//you can ignore the case by typing: variable.equalsIgnoreCase()
		if(c.equalsIgnoreCase(b)){
			System.out.println("It equals BUCKY");
		}
	}
}
