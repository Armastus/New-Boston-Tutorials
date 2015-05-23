
public class ComparingStrings {

	public static void main(String[] args) {
		
		int List1[] = {1, 17, 56, 85, 4, 5, 65, 32, 5, 4, 12, 23, 56, 98, 6, 45, 15, 3, 19, 28, 9, 38, 49, 8, 35, 48, 7, 29, 4, 17, 16};
		int List2[] = {24, 61, 253, 4327, 45, 5, 12, 25, 7, 56, 87, 4, 658, 45, 12, 9, 28, 26, 6, 24, 52, 8, 58, 56, 3, 51, 75, 79, 76, 73, 43, 46, 41, 4, 2};

		System.out.println("List1 \t List2");
		
		for (int x = 0; x < List1.length; x++) {
			for (int y = 0; y < List2.length; y++) {
				if (List1[x] == List2[y]) {
				System.out.println(List1[x] + "\t" +List2[y]);
				}
			}			
		}
	}
}
