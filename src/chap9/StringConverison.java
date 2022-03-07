package chap9;

//9.19 page no: 197

/* Use of method converting string  */

class StringConverison
{
	public static void main(String[] s)
	{
		
		String str1="I like Java";
		String strAry[]=new String[5];
		byte byteAry[]=new byte[20];
		
		System.out.println("Given string is \""+str1+"\"");
		System.out.println("String in lowercase: \""+str1.toLowerCase()+"\"");
		System.out.println("String in uppercase: \""+str1.toUpperCase()+"\"");
		
		System.out.println("\nString converted to array of bytes");
		byteAry=str1.getBytes();
		for(int i=0;i<byteAry.length;i++)
		System.out.println(byteAry[i]);
	} //main
} // class



