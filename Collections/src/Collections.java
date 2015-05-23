import java.util.*;
public class Collections {
	public static void main(String[] args) {
		String[] things = {"eggs", "lasers", "hats", "pie"};
		//This will create a list
		List<String> list1 = new ArrayList<String>();
		
		//add array items to the list
		//as loops goes through the array it will .add them to list1.
		for (String x: things)
			list1.add(x);
		
		String[] morethings = {"lasers", "eggs"};
		List<String> list2 = new ArrayList<String>();
		
		for (String y: morethings)
			list2.add(y);
		
		//print out list1
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("%s", list1.get(i));
		}
		
		System.out.println();
		
		//print out list2
		for(int i = 0; i < list2.size(); i++) {
			System.out.printf("%s", list2.get(i));
				}
	}
}
