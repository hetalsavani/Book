package chap7;

//7.1 page no:153

class Prime
	{
		public static void main(String[] s)
		{
			boolean prime;
			int i, last, n;
			
			System.out.println("Prime numbers between 3 and 100");
			for(n=3;n<100;n=n+2)	//No need to try even numbers > 2
			{
				if(n<4)
				{
					prime=true;
					System.out.println(n);
					continue;
				}
				// if (n%2==0) prime=false
				prime=true;
				i=3;last=(int)Math.sqrt(n);
				do
				{
					if(n%i==0) // n is divisible by i
					{
						prime=false;
						break; // break innermost do...while loop???
					}
					i=i+2; // no need to divide by even numbers
				}while(prime&&(i<last)); // end of  do...while loop???
				if(prime)System.out.println(n);
			} // end of for loop
		} // end of main()
	} // end of class
