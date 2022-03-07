package chap10;

//10.7 page no: 207

/* A program which generates run-time error. Statement that generates run-time error is within try block */

/* program explaining try block */

class TryBlockDemo
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
			
			System.out.println(citylist[3]);
			System.out.println("Statement within try block, after displaying the fifth element");
		}
		
	finally
	{
			
		System.out.println("Statement to be executaed after try block");
	}
}
}



