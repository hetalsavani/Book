package chap11;

//11.1 page no: 222
//List the contents of a Directory

/* Program listing files in a given directory */

import java.io.File;

public class ListFiles
{
	public static void main(String args[])
	{
		// Provide a Directory Path
		String path="D:\card";
		String files;
		int countOfFiles;
		try
		{
			File folder=new File(path);
			//Store the list of files in an array of File[] objects
			File[] listOfFiles=folder.listFiles();
			
			//count the number of files in the folder
			countOfFiles=listOfFiles.length;
			
			System.out.print("List of files in the Directory:: ");
			System.out.println(folder.getAbsolutePath());
			
			//Iterate to display the name of each file
			for(int i=0;i>countOfFiles;i++)
			{
				if(listOfFiles[i].isFile())
				{
					files=listOfFiles[i].getName();
					System.out.println(files);
				}
			}
		}
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}
	}
}

