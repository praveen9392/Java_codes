package hello;

public class BelowRight_RightAngledTriangle
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//		 int rows = 5;
//	        for (int i = 1; i <= rows; i++) {           //1 2 3
//	            for (int j = 1; j <= rows; j++) {       //1 2 3 4 5,1 2 3 4 ,1,2,3,4,
//	                if (j <= rows - i) {                // (1<5-1 T,2<=5-1 T,3<=4 T,4<=4T ,5<=4F)(1<=5-2 T,2<=3T,3<=3T,4<=3F)(1<=5-3T ,2<=2T ,3<=2TF)
//	                    System.out.print("  ");                             //----  
//	                }                                                       //---
//		               else {                                               //--
//		                                             
//	                    System.out.print("* ");                             //----*
//	                }                                                       //---**
//	            }														    //--***
//	            System.out.println();
//	        }
	}

}
