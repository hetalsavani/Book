package chap7;

//7.16 page no:155

class LblLoop // Use of labelled block to break the outer loop
	{
		public static void main(String[] s)
		{
			boolean prime=true;
			int i, last, n;
			
			//break the loops as soon as first non-prime odd number id found
			
			forLoop: for(n=41;n<100;n=n+2)
			{
				if(n<4)
				{
					prime=true;
					System.out.println(n);
					continue;  // statemnts after continue will be dropped & loop will run for next time
					                 // will not go to "prime=true;" instead will go to "n=n+2" then "n<100"
				}
				
				prime=true;
				i=3;last=(int)Math.sqrt(n);
				do
				{
					if(n%i==0) // n is divisible by i
					{
						prime=false;
						break forLoop; // break for loop labelled 'forLoop'
					}
					i=i+2;  // no need to divide by even numbers
				}while(prime && (i<last)); //end of ...while loop
				if(prime)System.out.println(n+" is prime");
			} // end of for loop
				if(!prime)System.out.println(n+" is is not prime");
		} // end of main()
	} //end of classfor 
	  
