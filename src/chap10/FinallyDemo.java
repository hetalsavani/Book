package chap10;

//10.14 page no: 211

//A program which generates multiple run-time error. There is a finally block following try block . There are no catch blocks in this program

/* Explaining  "finally" block except "catch" block */

class FinallyDemo
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
			answer=numerator/deniminator; // Generates ArithmaticException
			System.out.println("End of try block...");
		}
		
		finally
		{
			System.out.println("This part of code will always get executed");
		}
		
		System.out.println("End of Program...");
	}
}



