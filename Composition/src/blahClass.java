
public class blahClass {
	 private String name;
	 private toStringClass birthday;
	 
	 public blahClass(String theName, toStringClass theDate) {
		 name = theName;
		 birthday = theDate;
	 }
	 
	 //toString will search for the correct 'string' to pass in.
	 public String toString() {
		 //formats everything into a string. %s takes on 'name' and next %s takes on 'birthday'.
		 //the first %s brings in a normal string but the second %s takes in an object that needs to be
		 //a string; so then it looks to the 'toString' method.
		 return String.format("My name is %s, my birthday is %s", name, birthday);
	 }
}
