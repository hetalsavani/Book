package chap11;

//11.5 page no: 234

//Accepts input at command prompt

/*  Program adding two numbers  */

import java.io.*;
import java.util.*;


class ScannerInputDemo
{
	public static void main(String args[])
	{
		Scanner kbinput=null;
		int number1;
		int number2;
		int sum=0;
				
		try
		{
			//Create an object of Scanner class
			//that reads from Standard Input
			
			kbinput=new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			//Read the integer number from console
			number1=kbinput.nextInt();
			
			System.out.println("Enter the second number: ");
			//Read the integer number from console
			number2=kbinput.nextInt();
			
			sum=number1+number2;
			System.out.println("Sum is : "+sum);
		}
				
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}				
		
		finally
		{
			try
			{
				kbinput.close();
			}
			catch(Exception eobj)
			{
				System.out.println(eobj);
			}
		}			
	}
}

3
