package chap9;

//9.20 page no: 198

/* Reversing the string */

class StringReverse
{
	public static void main(String[] s)
	{
		
		String str=new String("I Like Java");
		
		System.out.println("Given string: "+str);
		System.out.println("Reverse String: "+reverseStr(str));
	}
		
	static String reverseStr(String str) // reverse string
	{
		int len=str.length();
		byte byteAry[]=new byte[len];
		byteAry=str.getBytes(); // convert to byte array
		for(int i=0,j=len-1;i<len/2;i++,j--) // exch half array
		{
			byte tmp=byteAry[i];
			byteAry[i]=byteAry[j];
			byteAry[j]=tmp;
		}
		return new String(byteAry); // used constructor
	} 
} //class



