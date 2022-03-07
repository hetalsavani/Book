package chap10;

//10.21 page no: 216

//A program that creates Custom Exception 

/* Class InvalidMarksException is a user defined class which is inherited from java.lang.Exception class
	This program won't proceed untill valid marks are entered */

/* User defined exception handler */

import java.util.Scanner;

class InvalidMarksException extends java.lang.Exception
{
	public InvalidMarksException(String message)
	{
		super(message);
	}
}

class CustomExceptionDemo2
{
	public static void main(String args[])
	{
		Scanner kbinput=new Scanner(System.in);
		int marks;
		boolean continueLoop=true;
		do
		{
			System.out.println("Enter the marks: ");
			marks=kbinput.nextInt();
			System.out.println("You entered "+marks);
			try
			{
				if(marks<0||marks>100)
				{
					throw new InvalidMarksException("Wrong marks..."); // Throw Customized Exception object
				}
				else
				{
					System.out.println("Marks are valid");
				}
				continueLoop=false;
			}
					
			catch(InvalidMarksException eobj)
			{
				System.out.println("Exception caught: "+eobj);
			}
		}
	while(continueLoop);
	}
}


