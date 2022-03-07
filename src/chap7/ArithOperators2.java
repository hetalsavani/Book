package chap7;

//7.9 page no:142

class ArithOperators2
{
	public static void main(String[] args)
	{
		short x=6;
		int y=4;
		float a=12.5f;	//suffix f to explicitly specify floating point literal
		float b=7.2f;	//suffix f  for floating point literal
	
		System.out.println("x is"+x+", y is"+y);
		System.out.println("x+y="+x+y);  // Effect of removing ( ) from (x+y)
		System.out.println("x-y="+(x-y));
		System.out.println("x/y="+(x/y));
		System.out.println("x%y="+(x%y));
		x=-6;
		System.out.println("x%y="+(x%y));
		y=-4;
		System.out.println("x%y="+(x%y));
		x=6; y=-4;
		System.out.println("x%y="+(x%y));
	
		System.out.println("a is" +a+ ", b is"+b);
		System.out.println("a/b="+(a/b));
		System.out.println("a/x="+(a/x));
		System.out.println("a%x="+(a%x));
		System.out.println("a%b="+(a%b));
	}	//end of main()
}	//end class ArithOperators
