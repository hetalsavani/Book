package chap8;

//8.2 page no: 177


class Room
	{
		protected float length, width, height;
		protected byte nWindows;
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
			nWindows=l;
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
	
class Library
	{
		int nBooks, nMagazines,nNewspapers;
		Room readingRoom;
		Library(){};
		Library(int nB, int nM, int nN, Room r)
		{
			nBooks=nB; nMagazines=nM; nNewspapers=nN;
			readingRoom=r;
		}
		
		void display()
		{
			System.out.println("\nLibrary Details:\nNumber of books: "+nBooks);
			System.out.println("Number of subscribed magazines: "+nMagazines);
			System.out.println("Number of subscribed magazines: "+nNewspapers);
			System.out.println("Reading Room: ");
			readingRoom.display();
		}
	}// end class Library
	
class Container /* Application using Room, Library */
	{
		public static void main(String args[])
		{
			Room r1=new Room(20,15,10,(byte)2);
			r1.display();
			Library lib=new Library(300,20,5,r1);
			lib.display();
		} // end main()
	} // end class Container
	