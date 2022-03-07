package chap9;

//9.10 page no: 192

/* Creating and initializing 2-D array  */

class Array2D
{
	public static void main(String[] s)
	{
		int marks1[][];
		marks1=new int[5][3];
		int marks2[][]=new int[5][3];
		int [][] marks3=new int[5][3];
		int marks4[][]={{50,60,70},{35,30,50},{70,75,80},{80,85,90},{50,50,55}};
		int [][]marks5={{50,60,70},{35,30,50},{70,75,80},{80,85,90},{50,50,55}}; 
		
		System.out.print("2-D Array marks1:\n");
		display(marks1,5,3);
		
		System.out.print("2-D Array marks2:\n");
		display(marks2,5,3);
		
		System.out.print("2-D Array marks3:\n");
		display(marks3,5,3);
		
		System.out.print("2-D Array marks4:\n");
		display(marks4,5,3);
		
		System.out.print("2-D Array marks5:\n");
		display(marks5,5,3);
	} // main

	static void display(int arr[][], int rows, int cols)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	} // display
} // class