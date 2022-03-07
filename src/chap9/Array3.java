package chap9;

//9.3 page no: 188
//Creating and initializing 1-D array specifiying size with array variable


/*  It is invalid to specify size of  elements of  an Array Object  while giving them initial values*/

class Array3
{
	public static void main(String[] s)
	{
//		int marks4[3]={50,60,70};
//		int[5] marks={70,80,90}
		
		int marks4[]={50,60,70};
		int[] marks5={70,80,90};
		
		System.out.print("Array marks4:\t");
		display(marks4,3);
		
		System.out.print("Array marks5:\t");
		display(marks5,3);
	}
	
	static void display(int arr[], int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}

