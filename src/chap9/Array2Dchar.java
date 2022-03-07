package chap9;

//9.13 page no: 193

/* 2-D Array of different no. of columns  */

class Array2Dchar
{
	public static void main(String[] s)
	{
		char names[][]={{'J','a','v','a'},{'c'},{'C','+','+'},{'B','s','i','c'},{'P','a','s','c','a','l'}};
				
		System.out.print("Number of elements in 2-D array: "+names.length+"\n");
		System.out.print("Five namesstored in 2-D Array of characters:\n");
		display(names,5);
	} // main
	
	static void display(char arr[][], int rows)
	{
		for(int i=0;i<rows;i++)
		{
			System.out.print("Row "+i+"have "+arr[i].length+" character elements: ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	} // display
} // class
