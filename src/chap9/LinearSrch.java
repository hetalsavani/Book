package chap9;

//9.7 page no: 190

//Search element in array using linear search

/*  To search element of specific size  */

class LinearSrch
{
public static void main(String[] s)
{
	double list[]={6,5,7,9,9.5,6.5,7.5,8};
	int indx;
	
	System.out.println("Given Array elements are:");
	display(list);
	
	indx=search(list,8); // search 8
	if(indx<0)
		System.out.println("\nelement 8 is not found in array");
	else
		System.out.println("\nelement 8 is found at position "+indx);
	indx=search(list,5.5); // search 5.5
	
	if(indx<0)
		System.out.println("\nelement 5.5 is not found in array");
	else
		System.out.println("\nelement 5.5 is found at position "+indx);
} // end main

static void display(double ary[])
{
		for(int i=0;i<ary.length;i++)
		{
			System.out.println(ary[i]);
		}
		System.out.println();
} // end display

static int search(double ary[], double x)
{
		for(int i=0;i<ary.length;i++)
		{
			if(ary[i]==x)return i;
		}
		return -1;
} // end search

} // end class


