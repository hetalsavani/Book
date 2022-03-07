package chap11;

//11.2 page no: 227

/*  Program describing writing to a file   */

import java.io.*;

public class FileWriterDemo
{
	public static void main(String args[])
	{
		FileWriter fwobject=null;
		try
		{
			//Create an object of FileWriter
			fwobject=new FileWriter("Charfile.txt");
			
			
			//Write strings to the file
			fwobject.write("File writing starts...");
			
			for(int i=1;i<11;i++)			
				fwobject.write("Line : "+ i +"\n");
			
			fwobject.write("File writing ends...");
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
				fwobject.close();
			}
			catch(Exception eobj)
			{
				System.out.println(eobj);
			}
		}			
	}
}

