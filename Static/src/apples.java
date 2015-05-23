
public class apples {
	public static void main(String[] args) {
		tuna member1 = new tuna ("Shakira", "Nice");
		tuna member2 = new tuna ("Natalie", "Portman");
		tuna member3 = new tuna ("Lindsey", "Sterling");
		
		//getMembers will share the value of 'members' with each variable
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println();
		System.out.println(member3.getFirst());
		System.out.println(member3.getLast());
		System.out.println(member3.getMembers());
		
		//let's just print the 'members' value
		System.out.println();
		System.out.println(tuna.getMembers());
	}
}
