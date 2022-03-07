package chap11;

//11.6 page no: 235

//Accepts input at command prompt

/*  Program calculating total marks of student    */

import java.io.*;
import java.util.*;


class ScannerFileDemo
{
	public static void main(String args[])
	{
		Scanner fileinput=null;
		int rollno, mark1, mark2, mark3, totalmarks;
		String name=null;
		File fobject;
				
		try
		{
			//Specify the file from where data is to be read
			fobject=new File("Students.dat");
			
			//Create an object of Scanner class that reads from file
			fileinput=new Scanner(fobject);
			
			//Display the default Delimiter to separate fields within a file
			System.out.println("Default delimeter is : "+fileinput.delimeter()+ "\n");
			
			//Iterate to read the values of each record
			while(fileinput.hasNext())
			{
				rollno=fileinput.nextInt();
				name=fileinput.next();
				mark1=fileinput.nextInt();
				mark2=fileinput.nextInt();
				mark3=fileinput.nextInt();
				totalmarks=mark1+mark2+mark3;
							
				System.out.println("Total marks of Rollno " +rollno+ ", " +name+ " are : " + totalmarks);
			}
			fileinput.close();
		}
				
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}										
	}
}


