package chap8;

//8.2 page no: 177


class Room
	{
		float length, width, height;
		byte nWindows;
		static int totWindows; // class variable
		
		Room(){}; // user-defined no-argument constructor
		Room(float l, float w, float h, byte n)
		{
			length=l; width=w; height=h;
			nWindows=n; totWindows+=n;
		}
		
		Room(float l, float w)
		{
			length=l; width=w; height=10;
			nWindows=1;
			totWindows++;
		}
		
	double area() // area=length*width
		{ 
			return(length*width);
		} // end area() method
		
	void display()
		{
			System.out.println("\nLength: "+length+"\nWidth: "+width);
			System.out.println("Height: "+height);
			System.out.println("Windows: "+nWindows);
		}// end display() method
	}// end Room class
	
class Classroom extends Room
	{
		int nBenches, nSeatsBench;
		Classroom(){};
		
		Classroom(float l, float w, float h, byte n, int nB, int nSB)
		{
			super(l,w,h,n);
			nBenches=nB; nSeatsBench=nSB;
		}
		
		void show()
		{
			super.display();
			System.out.println("Benches: "+nBenches);
			System.out.println("Seats per Bench: "+nSeatsBench);
			System.out.println("Total Seats in a class: "+getSeats());
		}
		void display()
		{
			System.out.println("\nClsaaroom with length "+length+" feet,width"+width+" feet\nhas "+nBenches+" Benches, each to accomodate"+nSeatsBench+" Students\nSo, Total seats in a class is "+getSeats());
		}
		int getSeats(){return nBenches*nSeatsBench;}
	}// end class Classroom
	
class Inheritance /* Application using Room, Classroom */
	{
		public static void main(String args[])
		{
			Room r1=new Room(20,15,10,(byte)2);
			r1.display();
			Classroom cr1=new Classroom(30,20,12,(byte)3,21,3);
			cr1.show();
			System.out.println("Area of classroom1 is "+cr1.area()+" square feet");
			Classroom cr2=new Classroom(30,30,10,(byte)4,20,4);
			cr2.display();
			System.out.println("\nTotal number of Windows: "+Room.totWindows);
		} // end main()
	} // end Inheritance
	