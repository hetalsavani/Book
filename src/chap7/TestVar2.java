package chap7;

//7.7 page no:138

//local variables are not initialized with default values. programmer should assign value before their first use

class TestVar2
{
	public static void main(String[] s)
	{
		float rate=10.2f;		// We should write as  " float rate=10.2f; "
		double amt=10000;
		
		amt=rate*amt;
		System.out.println("rate "+rate);
		System.out.println("Amout "+amt);
	}
}

