
public enum tuna {
	//enumeration are constants that are objects
	bucky("nice", "22"),
	melissa("cutie", "25"),
	paige("sweet", "28"),
	katey("blonde", "18"),
	maren("my love", "27");
	
	//create the two variables for the objects
	private final String desc;
	private final String year;
	
	//create the constructor for the enum and
	//make the variable equal to the arguments.
	tuna (String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	//create the two methods to return the arguments
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
