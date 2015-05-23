
public class kitchen {
	public static void main(String[] args) {
		//Polymorphism allows you to take classes using Inheritance 
		//from the superclass and assign those classes to your reference variable "bucky".
		//So bucky can be also assigned to tuna or potpie since those both use inheritance from
		//the superclas food. 
		//(ie) bucky[] = new tuna[2]; 
		//so bucky can be used more than once.
		food bucky[] = new food[2];
		bucky[0] = new potpie();
		bucky[1] = new tuna();
		
		//this for loop will first loop through to the potpie() method
		//then it loops again through to the tuna method and calls the eat()
		//method for each one.
		//This helps you loop through each object and call
		//each method of those objects.
		for (int x = 0; x < 2; x++) {
			bucky[x].eat();
		}
	}

}
