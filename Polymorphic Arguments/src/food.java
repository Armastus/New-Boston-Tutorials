//'abstract' makes it so that the food class is only used for 
//polymophism and/or inheritance.  It keeps this so that 
//other programmers cannot create new objects with the food class. 
 /*abstract*/ public class food {
	void eat() {
		System.out.println("This food is great!");
	}
}
