package chap10;

//10.10 page no: 209

/* A program which generates run-time error. Statement that generates run-time error is within try block 
	there is a corresponding catch block immediately below the try block */

/* Program expaining  "try...catch" block */

class TryCatchDemo
{
	public static void main(String args[])
	{
		/* Create an array of four elements */
		
		String citylist[]={"Ahmedabad","Baroda","Rajkot","Surat"};
		System.out.println("Statement to be executed before try");
		
		try
		{
			System.out.println("Statement within try block, before displaying the fifth element");
		
			/* Statement that generates run-time error */
			
			System.out.println(citylist[5]);
			System.out.println("Statement within try block, after displaying the fifth element");
		}
		catch(ArrayIndexOutOfBoundsException eobj)
		{
			System.out.println("Within Catch Block");		
			System.out.println("Caught Exception object of type :"+eobj);
		}
		System.out.println("Statement to be executed after try...catch");
	}
}


