package chap8;

//8.5 page no:166

class Prime
	{
		static boolean isPrime(int n)
		{	// n>1 is prime if it is not divisible by any number except 1 and itself
			int i, last;
						
			if(n<=1) return false;
			if(n<4) return true;
			
			// if (n%2==0) return false;	// divisible by 2 so not prime
			
			last=(int)Math.sqrt(n);
			i=3;
			do
			{
				if(n%i==0) return false;	// n is divisible by i
				i=i+2;	// no need to divide by even numbers
			}while(i<last); // end of do while loop
			
			return true;
		} // end of method isPrime
	} // end of method primefunc
	
	class primeClassMethod
	{
		public static void main(String[] s)
		{
			int i,n;
			
			System.out.println("Prime numbers between 3 and 100:");
			for(n=3;n<100;n=n+2)
			{
				if(Prime.isPrime(n)) System.out.println(n);
			}
		} // end of main
	} // end classes ClassMethodDemo
	