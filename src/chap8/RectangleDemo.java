package chap8;

//8.9 page no: 172

class Rectangle
	{
		double length,width;
		
		void setAttributes(double x, double y)
		{
			length=x; width=y;
		}
		
		double area()
		{
			return length*width;
		}
		
		void display()
		{
			System.out.println("Rectangle with length=" +length+ "width=" +width);
		}
	} // end class Rectangle
	
	class RectangleDemo
	{
		public static void main(String[] s)
		{
			Rectangle rect1;
			rect1=new Rectangle();
			Rectangle rect2=new Rectangle();
			
			rect1.setAttributes(10.5,20);
			rect1.display();
			System.out.println("Area of Rectangle is" +rect1.area());
			
			rect2.setAttributes(10,15);
			rect2.display();
			System.out.println("Area of Rectangle with length" +rect2.length+",width" +rect2.width+ "is" +rect2.area());
		} // end main()
	} // end class RectangleDemo
	

