public class fibonacci {
	public long fib(long i) {
		long sequence;
		//Because the first number if fibonacci = 0.
		if (i == 0) 
			return 0;
		//Because (2 - 1) + (2 - 2 ) = 1
		//and Because (1 - 1) + (1 - 2 ) = 1
		 else if(i <= 2)
			 return 1;
		 else
			sequence = fib(i - 1) + fib(i - 2);
		return sequence;
	}
}

