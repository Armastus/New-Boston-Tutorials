
public class apples {
	public static void main (String[] args) {
		tuna tunaObject = new tuna(10);
		
		for (int ii = 0; ii < 5; ii++) {
			tunaObject.add();
			System.out.printf("%s", tunaObject);
		}
	}
}
