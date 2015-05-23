
public class tuna {
	private String first;
	private String last;
	//setup a static variable
	//static means that every object shares the same variable.
	//for example: all the girls share the "members" variable.  See output.
	private static int members = 0;
	
	public tuna(String fname, String lname){
		first = fname;
		last = lname;
		members++;
		//So this reads as "Constructors for Shakira, members in the club 1"
		//add another member "Constructors for Shakira Natalie, members in the club 2"
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
	
}
