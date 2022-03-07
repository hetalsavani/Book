package chap9;

//9.2 page no: 187

/*  To give default values as initial values to Array Object Element  */

class Array1
{
	public static void main(String[] s)
	{
		int marks[];
		marks=new int[7];
		
		for(int i=0;i<7;i++)
		{
			System.out.println("marks[" +i+ " ] is"+marks[i]);
		}
	}
}
