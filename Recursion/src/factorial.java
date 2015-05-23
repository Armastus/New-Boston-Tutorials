
public class factorial {
	//an example of recursion is a method that calls it's self
	//and continues to run until it no longer needs to.
	//Below we create a method that will recure in that 
	//if the number (long n) is more than 1 then do the following.
	public long fact(long n){
		//if user enter 1 or 0 we will return 1 since 
		//a factorial of 1! or 0! = 1.
		if (n <=1 )
			return 1;
		else
			//return n entered times the n-1
			//keep doing this until n <=1.
			//(n-1) will decrease the number each time
			return n * fact(n-1);
		
	}
}
