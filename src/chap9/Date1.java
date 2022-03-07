package chap9;

//9.21 page no: 199

/* Use of Date class */

import java.util.Date;

class Date1
{
	public static void main(String args[])
	{
		Date date1=new Date(); // current date, time
		// if not used: import java.util.Date; use next statement
		
		java.util.Date date2=new java.util.Date();
		System.out.println("date1: Date & Time: "+date1);
		System.out.println("date2: Date & Time: "+date2);
		
		System.out.println("Elapsed time since Jan 1, 1970 is\n\t" +date1.getTime()+" milliseconds");
		date1.setTime(date1.getTime()+10000000);
		System.out.println("DateTime after 1 crore milliseconds\n\t" +date1.toString());
		} // end main
	} // end class

