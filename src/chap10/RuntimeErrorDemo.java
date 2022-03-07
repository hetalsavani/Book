package chap10;

//10.3 page no: 204

/* A program which generates run-time error. An array of four elements is created but the program tries to access
	fifth element of the citylist[] array resulting in run-time error*/


class RuntimeErrorDemo
{
	public static void main(String args[])
	{
		/* Create an array of four elements */
		String Citylist[]={"Ahmedabad","Baroda","Rajkot","Surat"};
		System.out.println("Statement to be executaed before displaying the fifth element");
		
		/* Statement that generates run-time error */
		System.out.println(Citylist[5]);
		System.out.println("Statement to be executaed after displaying the fifth element");
	}
}

