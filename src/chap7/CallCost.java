package chap7;

//7.1 page no:129

/**
* This class implements a simple program that 
*will compute the cost of phone call and update balance 
*/


public class CallCost
{
	public static void main(String[] args)
	{
	
	/* declare variables*/
	double balance;		// balance amount in rupees
	double rate;		// call rate; rupees per second
	double duration;		// call duration in seconds
	double cost;		// cost of last call
	
	/*computations*/
	balance=170;
	rate=1.02;
	duration=37;
	cost=duration*rate;	// computes the cost
	balance=balance-cost;	// update balance amount
	
	/*display results*/
	System.out.print("Call Duration:");
	System.out.print(duration);
	System.out.println(" Seconds");
	System.out.println("Balance:"+balance+" Rupees");
	
	}	//end of main()
	
	}	//end of class CallCost
	
	
