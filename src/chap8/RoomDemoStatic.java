package chap8;

//8.3 page no: 165

/*  Class Room */
class Room
	{
		float length,width,height;
		byte nWindows;
		static int totWindows; //class variable
		
		void setAttr(float l, float w, float h, byte n)
			{
				setWindows(n);
				length=l; width=w; height=h;				
			}// end setAttr() method
			
		void setWindows(byte n)
			{
				totWindows=totWindows-nWindows+n;
				nWindows=n;
			}
		
		double area() // area = length * width
			{
				return(length*width);
			}// end of area() method
			
		void display()
			{
				System.out.println("\nLength:" +length+ "\nWidth:"+width);
				System.out.println("Height:" +height);
				System.out.println("Number of Windows:" +nWindows);
			}// end of display method
		}// end of Room class
		
	/* using Room class to create objects and run application */
	class RoomDemoStatic
		{
			public static void main(String args[])
				{
					// Create a room object, assigned default values to attributes
					Room r1=new Room(); Room r2=new Room();
					
					
					// Assign values of attributes of objects
					r1.setAttr(18,12.5f,10,(byte)2);  r1.display();
					r2.setAttr(14,11,10,(byte)1);  r2.display();
					
												
					// Display area
					System.out.println("\n Room2 Number of windows modified from 1 to 2");
					r2.setWindows((byte)2);
					System.out.println("\n Total number of Windows:"+Room.totWindows);
				}// end main()					
		}// end RoomDemo
		