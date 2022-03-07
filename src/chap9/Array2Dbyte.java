package chap9;

//9.14 page no: 193

/* Storing integer numbers into byte according to characters */

class Array2Dbyte
{
	public static void main(String[] s)
	{
		byte names[][]={{'J','a','v','a'},{67},{'C','+','+'},{'B','s','i','c'},{'P','a','s','c','a','l'}};
				
		System.out.print("Five names stored in 2-D array of bytes:\n");
		display(names,5);
	} // main
	
	static void display(byte arr[][], int rows)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	} // display
} // class
