package chap8;

//8.12 page no: 175

class Rectangle
	{
		private double length,width;
		
		Rectangle(double x, double y)
		{
			length=x; width=y;
		}
		
		Rectangle(){};
			
		double area()
		{
			return length*width;
		}
		
		void display()
		{
			System.out.println("Rectangle with length=" +length+ "width=" +width);
		}
		
		double getLength(){return length;}		
		double getWidth(){return width;}
		boolean isLarge(Rectangle rect)
		{
			if(area()>rect.area()) return true;
			else return false;
		}
		
	} // end class 
	
	class ObjectParameter
	{
		public static void main(String[] s)
		{
			Rectangle rect1=new Rectangle(8,20);
			Rectangle rect2=new Rectangle(10,15);
			
			rect1.display(); 
			System.out.println("Area of Rectangle 1 is" +rect1.area()+"\n");

			rect2.display();
			System.out.println("Area of Rectangle 2 is" +rect2.area()+"\n");
			if(rect1.isLarge(rect2))
				System.out.println("Area of rectangle 1 is larger than" + "Area of rectangle 2");
		} // end main()
	} // end class RectangleDemo
	
