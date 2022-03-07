package chap7;

//compute simple interest
//7.4 page no:132

public class interest
{
	public static void main(String[] args)
	{
		/* declare variables */
		double principal;		//principal amount in rupees
		double rate;		//interest rate in percentage
		double duration;		//number of years
		double maturity;		//maturity amount
		double interest;		//interest amount
	
		/* computations */
	
		principal=17000;
		rate=9.50;
		duration=3;
		interest=principal*duration*rate/100;	//compute interest amount
		maturity=principal+interest;			//compute maturity amount
	
		/* display results */
		System.out.println("Principal amount:" +principal+ "Rupees");
		System.out.println("Deposit for duration of"+duration+"Years");
		System.out.println("Interest Rate:"+rate+"%");
		System.out.println("Interest amount:"+interest+"Rupees");
		System.out.println("Maturity amount:"+maturity+"Rupees");
	}	//end of main()
}	//end of class interest
