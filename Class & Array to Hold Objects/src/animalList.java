
public class animalList {
	private Animals[] theList = new Animals[5];
	private int ii = 0;
	
	public void add(Animals a) {
		if (ii < theList.length){
			theList[ii] = a;
			System.out.println("Animal added at index " + ii);
			ii++;
		}
	}
}
