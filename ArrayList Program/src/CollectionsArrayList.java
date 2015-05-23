import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
//this program will print two lists and then remove items from one list and print out the new list.
public class CollectionsArrayList {
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
			System.out.printf("%s ", list1.get(i));
		}
		
		editList(list1, list2);
		System.out.println();
		
		//print out list1
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
	}

	public static void editList(Collection<String> L1, Collection<String> L2){
		//Iterators go through each list, item by item.
		Iterator<String> it = L1.iterator();
		//while the List has a next item go through the List
		while(it.hasNext()){
			//If items from list 2 are in list 1 then remove them. 
			if(L2.contains(it.next()))
				it.remove();
		}		
	}
}
