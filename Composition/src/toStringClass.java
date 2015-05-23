
public class toStringClass {
	private int month;
	private int day;
	private int year;
	//create the constructor
	public toStringClass(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		//'this' will use whatever is needed to complete the statement.
		//In 'this' case we need the toString to print "%s".
		System.out.printf("The constructor for this is %s\n", this);
	}
	//create the method
	//toString turns object into a string.
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
