package chap10;

//10.13 page no: 210

/* A program which generates multiple run-time error. There are multiple catch blocks to handle various particular Exceptions */

/*   Program exaplaining more than one  "catch"  block  */

class MultipleCatchDemo
{
	public static void main(String args[])
	{
		String citylist[]={"Ahmedabad","Baroda","Rajkot","Surat"};
		int numerator=15, deniminator=0, answer;
		System.out.println("Statement to be executed before try block");
		
		try
		{
			System.out.println("Begining of try block...");
			System.out.println(citylist[5]); // Generates ArrayIndexOutOfBoundsException
			answer=numerator/deniminator;
			System.out.println("End of try block...");
		}
		
		catch(ArrayIndexOutOfBoundsException eobj)
		{
			System.out.println("Within first catch block, exception caught: "+eobj);
		}
		
		catch(ArithmaticException eobj)
		{
			System.out.println("Within second catch block, exception caught: "+eobj);
		}

		catch(Exception eobj)
		{
			System.out.println("Within last catch block, exception caught: "+eobj); // Generic block
		}
		System.out.println("End of Program...");
	}
}



