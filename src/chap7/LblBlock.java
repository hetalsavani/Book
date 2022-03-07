package chap7;

//7.15 page no:154

class LblBlock		// Use of labelled block to break the outer loop
	{
		public static void main(String[] s)
		{
			int x=0;
			out:for(int i=4;i<10;i++)
			{
				x=10;
				while(x<100)
				{
					System.out.println("inside while loop: i is"+i+",x is"+x);
						if(i*x==350)
							break out;
						x=x+20;
				} // end of while
				System.out.println("\nOutside while loop: i is"+i+",x is"+x+"\n");
			} // end out for loop
			System.out.println("\nOutside for loop: x is"+x);
									
		} // end of main()
	} // end of class
