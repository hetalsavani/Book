package chap9;

//9.6 page no: 190

/*  Using sort() and fill() methods of Arrays class  */

class ArraysClassSortFill
{ // sort and fill methods on whole or partial array
	public static void main(String[] s)
	{
		double list[]={6.4,8,7.8,9.8,9.5,6,7,8,8.5,5.9};
		
		int indx;
		
		System.out.println("Initial Elements:");
		display(list);
		
		java.util.Arrays.sort(list,3,9); // sort partial array
		System.out.println("\nsort partial array: list[3] to list[8]:");
		display(list);
		
		java.util.Arrays.sort(list); // sort whole array
		System.out.println("\nsort whole array:");
		display(list);
		
		java.util.Arrays.fill(list,7); // fill whole array
		System.out.println("\nfill whole array:");
		display(list);
		
		java.util.Arrays.fill(list,2,6,5); // fill partial array
		System.out.println("\nfill whole array: list[2] to list[5]");
		display(list);
	} // end main
	
	static void display(double ary[])
	{
			for(int i=0;i<ary.length;i++)
			{
				System.out.print(ary[i]+"\t");
			}
			System.out.println();
	} // end display
} // end class



