package chap10;

//10.18 page no: 213

//A program which uses throw keyword to throw an exception object explicitly.

/* Program expaining  "throw"  statement */

class ThrowDemo
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Before throwing an exception object...");
		
			/* Create an Exception object */		
			Exception myobject=new Exception("Demonstration of throw...");
			
			throw myobject; // throw the exception object explicitly
			
			/* Statements within below throw will generate compile time error */
		}
		
		catch(Exception eobj)
		{
			System.out.println("Exception caught: "+eobj);
		}
	}
}

