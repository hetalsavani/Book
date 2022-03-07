package chap9;

//9.15 page no: 194

/* Creating objects of STRING class using different constructors */

class String1
{
	public static void main(String[] s)
	{
		char name[]={'J','a','v','a'};
		
		String str1=new String();
		String str2=new String(name);
		String str3=new String(name,1,2);
		String str4=new String(str3);
		String str5=new String("Java");
		
		System.out.println("str1 is " +str1);
		System.out.println("str1 is " +str2);
		System.out.println("str1 is " +str3);
		System.out.println("str1 is " +str4);
		System.out.println("str1 is " +str5);		
	} //main
} // class

