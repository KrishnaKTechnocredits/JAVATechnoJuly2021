package indu.Assignment_53;

public class PatternPrinting_53 {

	
	static void pattern1()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2()
	{
		for(int i =5 ;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3()
	{
		for(int i = 1;i<=5;i++)
		{
			for(int k =1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4()
	{
		for(int i = 1;i<=5;i++)
		{
			for(int k =1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern5(int rows)
	{
		
			for (int i=0; i<rows; i++)   
			{ 
				if(i%2==0)
				{
					int j;
					for (j=rows-i;j>1;j--)   
					{  
						System.out.print(" ");   
					} 
					for (j=0; j<=i; j++ )   
					{    
						System.out.print("* ");   
					}   
					System.out.println();   
				} 
			}
			
			for (int i=rows-2; i>=1; i--)   
			{ 
				if(i%2!=0)
				{
					int j;
					for (j=rows-i;j>=1;j--)   
					{  
						System.out.print(" ");   
					} 
					for (j=0; j<=i-1; j++ )   
					{    
						System.out.print("* ");   
					}   
					System.out.println();   
			    } 
			}
		}
		
	static void pattern6(int rows)
	{
		for (int i=rows-1; i>=1; i--)   
		{  
			//int j;
			for (int j=rows-i;j>=1;j--)   
			{  
				System.out.print(" ");   
			} 
			for (int j=0; j<=i-1; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
	}
	
	static void pattern7() 
	{
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=4 ;i>=0;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
	}
	
	static void pattern8(int rows)
	{
		
			for (int i=0; i<rows; i++)   
			{  
				int j;
				for (j=rows-i;j>1;j--)   
				{  
					System.out.print(" ");   
				} 
				for (j=0; j<=i; j++ )   
				{    
					System.out.print("* ");   
				}   
				System.out.println();   
			} 
			
			for (int i=rows-2; i>=1; i--)   
			{  
				int j;
				for (j=rows-i;j>=1;j--)   
				{  
					System.out.print(" ");   
				} 
				for (j=0; j<=i-1; j++ )   
				{    
					System.out.print("* ");   
				}   
				System.out.println();   
			} 
		}
	static void pattern9()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern10(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern12(int n)
	{
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0){
				temp=1;
			}else{
				temp=0;
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print(temp);
				if(temp==1){
					temp=0;
				}else{
					temp=1;
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	static void pattern13(int n)
	{
		int temp=65;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(temp+j));
			}
			
			System.out.println();
		}
	}
	
	static void pattern14(int n)
	{
		int temp=65;
		int temp1=97;
		for(int i=0;i<n;i++)
		{
			if(i%2!=0){
				for(int j=0;j<=i;j++)
				{
					System.out.print((char)(temp1+j));
				}
			}else{
				for(int j=0;j<=i;j++)
				{
					System.out.print((char)(temp+j));
				}
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n)
	{
		int temp=65;
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*n;j++)
			{
				if(j%2==0){
					System.out.print(count++);
				}else{
					System.out.print((char)(temp++));
				}
			}
		System.out.println();
		}
		}
	public static void main(String[] args) {
		System.out.println("--------Pattern 1 ------------");
		pattern1();
		System.out.println("--------Pattern 2 ------------");
		pattern2();
		System.out.println("--------Pattern 3 ------------");
		pattern3();
		System.out.println("--------Pattern 4 ------------");
		pattern4();
		System.out.println("--------Pattern 5 ------------");
		pattern5(10);
		System.out.println("--------Pattern 6 ------------");
		pattern6(5);
		System.out.println("--------Pattern 7-----------");
		pattern7();
		System.out.println("--------Pattern 8-----------");
		pattern8(5);
		System.out.println("--------Pattern 9-----------");
		pattern9();
		System.out.println("-------Pattern10--------");
		pattern10(4);
		System.out.println("-------Pattern11--------");
		pattern11(4);
		System.out.println("-------Pattern12--------");
		pattern12(4);
		System.out.println("-------Pattern13--------");
		pattern13(4);
		System.out.println("-------Pattern14--------");
		pattern14(4);
		System.out.println("-------Pattern15--------");
		pattern15(3);
	}
	 
	 
	
}
