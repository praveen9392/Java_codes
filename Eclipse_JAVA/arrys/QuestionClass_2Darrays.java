package arrys;



public class QuestionClass_2Darrays
{

	public static void main(String[] args) 
	{
		
		//sum();
		//SumEachRow();
		//leftdigonal();
		//Rightdigonal();
		//Copy();
		//add2arraysIntoAnother();
		//EvenNumbers();
		PrimeNumbers();
		
	}
	static void sum()
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
	static void SumEachRow()
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			int sum=0,min=9,max=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
				if(a[i][j]<min)
					min=a[i][j];
				else if(a[i][j]>max)
				    max=a[i][j];
			}
			System.out.println();
			System.out.println("sum of "+i+"Row is "+sum);
			System.out.println("maxmimum element in row"+i+" is="+max);
			System.out.println("minimum elemnt in row"+i+" is="+min);
		}
	}
	static void leftdigonal()
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]);
				}
			}
		}
		System.out.println();
	}
	static void Rightdigonal()
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i+j==2)
				{
					System.out.println(a[i][j]);
				}
			}
		}
		System.out.println();
	}	
	static void Copy()
	{
		int a[][]= {{1,2,3,4},{4,5,6,6},{7,8,9,9}};
		int b[][] = new int[3][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[i][j];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void add2arraysIntoAnother()
	{
		int a[][]= {{1,2,3,4},{4,5,6,6},{7,8,9,9}};
		int c[][]= {{1,2,3,4},{4,5,6,6},{7,8,9,9}};
		int b[][] = new int[3][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[i][j]+c[i][j];
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	static void EvenNumbers()
	{
		int a[][]= {{1,2,3,4},{4,5,6,6},{7,8,9,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				     System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void PrimeNumbers()
	{
		int a[][]= {{1,2,3,4},{4,5,6,6},{7,8,9,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int count=0;
				for(int k=1;k<=a[i][j];k++)
				{
					if(a[i][j]%k==0)
						count++;
				}
				if(count==2)
					System.out.println(a[i][j]);
			}
			
		}
	}	
}
