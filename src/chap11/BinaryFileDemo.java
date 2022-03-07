package chap11;

//11.4 page no: 232

//Program to read and write bytes to binary file

/*  Program for reading and writing byte to a file   */

import java.io.*;

public class BinaryFileDemo
{
	public static void main(String args[])
	{
		FileOutputStream outobject=null;
		FileInputStream inobject=null;
		String cities=" Rajkot \n Ahmedabad \n Vadodara \n Vapi \n";
		
		//Convert cities into byte array
		byte citiesarray[]=cities.getBytes();
		
		try
		{
			//Create an object of Binary output stream
			
			outobject=new FileOutputStream("Binaryfile.dat");
			
			//Write the array of bytes into file
			outobject.write(citiesarray);
			outobject.close();
			
			//Create object of Binary input stream
			inobject=new FileInputStream("Binaryfile.dat");
			
			//Variable to read each byte
			
			int i;
			
			//Read each byte from the file and display			
			while((i=inobject.read())!=-1)
			{
				System.out.print((char)i);
			}
			inobject.close();
		}
		
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}				
	}
}

