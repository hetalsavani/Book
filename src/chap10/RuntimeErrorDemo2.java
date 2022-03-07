package chap10;

//10.5 page no: 206

/* A program which generates run-time error. On dividing any number by zero generates Arithmatic Exception */


class RuntimeErrorDemo2
{
	public static void main(String args[])
	{
		int numerator=15;
		int denominator=0;
		int answer;
		
		System.out.println("Statement to be executaed before performing division operation");
		
		/* Statement that generates run-time error */
		answer=numerator/denominator; // Creates  ArithmaticException
		System.out.println("Statement to be executaed after performing division operation");
	}
}

