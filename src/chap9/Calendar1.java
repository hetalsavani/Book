package chap9;

//9.22 page no: 200

/* Use of  "Calendar"  class and its constants*/

import java.util.*;	// for Date, Calendar, GregorianCalendar class

class Calendar1
{
	public static void main(String s[])
	{
	
		System.out.println("Current Date & Time: "+new Date()); // current date, time
		
		// using current date & time
		Calendar calendar1=new GregorianCalendar();
		display(calendar1);
		
		// using given year,month, day
		Calendar calendar2=new GregorianCalendar(2013,11,17);
		display(calendar2);
		
		// using given date:year,month, day and time:hour,minute,second
		Calendar calendar3=new GregorianCalendar(2013,11,20,210,2);
		display(calendar3);
	} // end main()

	static void display(Calendar calendar)
	{
		// using Calendar contacts
		
		System.out.println("\nYear:\t"+calendar.get(Calendar.YEAR));
		System.out.println("Month:\t"+calendar.get(Calendar.MONTH));
		System.out.println("Date:\t"+calendar.get(Calendar.DATE));
		System.out.println("Hour(12 hour):\t"+calendar.get(Calendar.HOUR));
		
		if(calendar.get(Calendar.AM_PM)==1)
			System.out.println(" p.m.");
		else
			System.out.println(" a.m.");
		System.out.println("Hour(24 hour):\t"+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute:\t"+calendar.get(Calendar.MINUTE));
		System.out.println("Second:\t"+calendar.get(Calendar.SECOND));
		System.out.println("Day of Week: ");
		switch(calendar.get(calendar.DAY_OF_WEEK))
		{
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednesday");break;
			case 5: System.out.println("Thursday");break;
			case 6: System.out.println("Friday");break;
			case 7: System.out.println("Saturday");break;
			default: System.out.println("Error...");
		} // end main
	} // end main
} // end class
