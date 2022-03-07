package chap9;

//9.16 page no: 195

/* Creating same objects using "String literal" & "new" operator */

class String2
{
	public static void main(String[] s)
	{
		char name[]={'J','a','v','a'};
		
		String str1="I like Java";
		String str2="I like Java";
		String str3=new String("I love India");
		String str4=new String(str3);
		
		System.out.println("str1==str2: "+(str1==str2));
		System.out.println("str3==str4: "+(str3==str4));
		
		System.out.println("str1: " +str1);
		System.out.println("str2: " +str2);
		System.out.println("str3: " +str3);
		System.out.println("str4: " +str4);
	} //main
} // class

