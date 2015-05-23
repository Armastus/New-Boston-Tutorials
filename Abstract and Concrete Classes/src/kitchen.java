public class kitchen {
	public static void main(String[] args){
		//polymorphic arguments lesson
		yummy goodies = new yummy();
		//call potpie call
		food po = new potpie();
		
		//call the yummy object, goodies, and the method
		//and pass the classes in the arguments.
		goodies.digest(po);
	}
}
