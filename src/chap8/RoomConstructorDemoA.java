package chap8;

//8.7 page no: 169

/* Using Constructors */

class Room
	{
		float length,width,height;
		byte nWindows;
		static int totWindows; // Class variable
		
		Room(float l, float w, float h, byte n)
		{
			length=l; width=w; height=h;
			nWindows=n; totWindows+=n;
		}
		
		Room(float l, float w)
		{
			length=l; width=w; height=10;
			nWindows=1; totWindows++;
		}
		
		double area() // area=length*width
		{
			return(length*width); 
		} // end area() method
		
		void display()
		{
			System.out.println("\nLength:"+length+"\nWidth:"+width);
			System.out.println("Height:"+height);
			System.out.println("Windows:"+nWindows);
		} // end display() method
	} // end Room class
	
	class RoomConstructorDemoA /* Application using Room */
	{
		public static void main(String args[])
		{
			Room r1=new Room(16,12.5f);
			Room r2=new Room(20,14,12,(byte)2);
			r1.display(); r2.display();
			System.out.println("\nTotal number of Windows:" +Room.totWindows);
		} // end main()
	} // end RoomConstructionDemoA
		
		
		
