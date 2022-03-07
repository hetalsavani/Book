package chap9;

//9.18 page no: 196

/* Comparison of  "String"  using methods of string class */

class StringComparison
{
	public static void main(String[] s)
	{
		
		String str1="India is great";
		String str2="INDIA is Great";
		
		System.out.println("str1: " +str1);
		System.out.println("str1: " +str2);
		System.out.println("str1.equals(str2): "+(str1.equals(str2)));
		System.out.println("str1.equalsIgnoreCase(str2): "+(str1.equalsIgnoreCase(str2)));
		System.out.println("str1.compareTo(str2): "+(str1.compareTo(str2)));
		System.out.println("str1.compareToIgnoreCase(str2) :"+(str1.compareToIgnoreCase(str2)));
	} //main
} // class

