//'abstract' makes it so that the food class is only used for 
//polymophism and/or inheritance.  It keeps this so that 
//other programmers cannot create new objects with the food class. 
abstract public class food {
	//abstract methods:
	//By creating an abstract method you are saying that this method
	//NEEDS (MUST) to be overwritten elsewhere.
	//So the 'tuna' and 'potpie' class will overwrite the 'eat' method
	//and give the method a body.
	public abstract void eat();
}

//last note: in order to have an abstract method you must also 
//contain it within an abstract class.