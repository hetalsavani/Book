package chap11;

//11.3 page no: 229

//Reading from a file using character stream

/*  Program describing reading from a file   */

import java.io.*;

public class FileReaderDemo
{
	public static void main(String args[])
	{
		FileReader frobject=null;
		try
		{
			//Create an object of FileReader
			frobject=new FileReader("Charfile1.txt");
			
			int i;
			char ch;
			
			while((i=frobject.read())!=-1)
			{
				ch=(char)i;
				System.out.print(ch);
			}
		}
		
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}
		
		finally
		{
			try
			{
				//Close the filewriter
				frobject.close();
			}
			
			catch(Exception eobj)
			{
				System.out.println(eobj);
			}
		}			
	}
}
