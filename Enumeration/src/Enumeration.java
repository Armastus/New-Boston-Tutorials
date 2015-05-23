import java.util.EnumSet;

public class Enumeration {
	public static void main (String[] args) {
		//"name.values()" will loop through the constants like arrays.
		for (tuna blah: tuna.values())
		System.out.printf("%s\t%s\t%s\n", blah, blah.getDesc(), blah.getYear());
		
		System.out.println("\nAnd now for the range of constants!!\n");
		
		//EnumSet.range library allows us to setup a new starting point
		//and end point of our constant variable arrays.
		for (tuna girls: EnumSet.range(tuna.melissa, tuna.katey))
		System.out.printf("%s\t%s\t%s\n", girls, girls.getDesc(), girls.getYear());
	}
}
