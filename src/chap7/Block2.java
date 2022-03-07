package chap7;

//7.11 page no:149

class Block2
	{
		public static void main(String[] args)
		{
			int x=10;

			blk1:
			{// start of block1
				int y=50;
				System.out.println("inside the block1:");
				System.out.println("x:"+x);
				System.out.println("y:"+y);
			}// end of block1
			
			blk2:
			{// start of block2
				int y=20;
				//int x=30;	//conflict with x in main
				System.out.println("inside the block2:");
				System.out.println("x:"+x);
				System.out.println("y:"+y);
			}// end of block2
		System.out.println("outside the block: x is "+x);			
		}// end of main()
	}// end of class block
	
