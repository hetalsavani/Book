package chap8;

//8.1 page no: 159

/*  Class Room */
class Room
	{
		float length,width,height;
		byte nWindows;
		
		void setAttr(float l, float w, float h, byte n)
			{
				length=l; width=w; height=h;
				nWindows=n;
			}// end setAttr() method
		
		double area() // area = length * width
			{
				return(length*width);
			}// end of area() method
			
		void display()
			{
				System.out.println("\nLength:" +length);
				System.out.println("Width:" +width);
				System.out.println("Height:" +height);
				System.out.println("Number of Windows:" +nWindows);
			}
		}// end of Room class
		
	/* using Room class to create objects and run application */
	class RoomDemo
		{
			public static void main(String args[])
				{
					// Create a room object, assigned default values to attributes
					Room r1; // reference variable with null value by default
					r1=new Room();
					// Both declare and create in one statement
					Room r2=new Room();
					
				// Display two room objects with initial default value
					r1.display();
					r2.display();
					
					// Assign values of attributes of objects
					r1.setAttr(18,12.5f,10,(byte)2);
					r2.setAttr(14,11,10,(byte)1);
					
					//Display updated contents
					r1.display();
					r2.display();
					
					// Display area
					System.out.println("\n Area of room with length"+r1.length+ "width" +r1.width+ "is" +r1.area());
					System.out.println("\n Area of room with length"+r2.length+ "width" +r2.width+ "is" +r2.area());
				}// end main()					
		}// end RoomDemo
		