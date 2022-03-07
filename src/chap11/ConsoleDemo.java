package chap11;

// 11.7 page no: 237

//Program to reading passwords

/*   Program reading username & password  */

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo
{
	public static void main(String[] args)
	{
		Console console=System.console();
		String username=console.readLine("Username: ");
		char[] password=console.readPassword("Password: ");
		
		if(username.equals("admin") && String.valueOf(password).equals("secret"))
		{
			console.printf("Welcome to Java Application \n");
		}
		else	
		{
			console.printf("Invalid username or password. \n");
		}
	}
}


