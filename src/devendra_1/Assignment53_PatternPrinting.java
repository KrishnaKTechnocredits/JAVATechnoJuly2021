package devendra_1;

public class Assignment53_PatternPrinting {

	static void pattern1()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2()
	{
		for(int i = 5; i >= 0; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 1; k <= 5 - i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern4()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int k = 1; k <= 5 - i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern5(int rows)
	{

			for (int i = 0; i < rows; i++)   
			{ 
				if(i % 2 == 0)
				{
					//int j;
					for (int j = rows - i; j > 1; j--)   
					{  
						System.out.print(" ");   
					} 
					for (int j = 0; j <= i; j++ )   
					{    
						System.out.print("* ");   
					}   
					System.out.println();   
				} 
			}

			for (int i = rows - 2; i >= 1; i--)   
			{ 
				if(i % 2 != 0)
				{
					//int j;
					for (int j = rows - i; j >= 1; j--)   
					{  
						System.out.print(" ");   
					} 
					for (int j = 0; j <= i - 1; j++ )   
					{    
						System.out.print("* ");   
					}   
					System.out.println();   
			    } 
			}
		}

	static void pattern6(int rows)
	{
		for (int i = rows - 1; i >= 1; i--)   
		{  
			//int j;
			for (int j = rows - i; j >= 1; j--)   
			{  
				System.out.print(" ");   
			} 
			for (int j = 0; j <= i - 1; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
	}

	static void pattern7() 
	{

		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		for(int i = 4; i >= 0; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern8(int rows)
	{		
		for (int i = 0; i < rows; i++)   
			{  
				//int j;
				for (int j = rows - i; j > 1; j--)   
				{  
					System.out.print(" ");   
				} 
				for (int j = 0; j <= i; j++ )   
				{    
					System.out.print("* ");   
				}   
				System.out.println();   
			} 

			for (int i = rows - 2; i >= 1; i--)   
			{  
				//int j;
				for (int j = rows - i; j >= 1; j--)   
				{  
					System.out.print(" ");   
				} 
				for (int j = 0; j <= i - 1; j++)   
				{    
					System.out.print("* ");   
				}   
				System.out.println();   
			} 
		}
		
	static void pattern9()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1 ;j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n)
	{
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	static void pattern11(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	static void pattern12(int n)
	{
		int temp = 0;
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 != 0){
				temp = 1;
			}else{
				temp = 0;
			}
			for(int j = 1; j <= n; j++)
			{
				System.out.print(temp);
				if(temp == 1){
					temp = 0;
				}else{
					temp = 1;
				}
			}

			System.out.println();
		}
	}

	static void pattern13(int n)
	{
		int temp = 65;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print((char)(temp + j));
			}

			System.out.println();
		}
	}

	static void pattern14(int n)
	{
		int temp = 65;
		int temp1 = 97;
		for(int i = 0; i < n; i++)
		{
			if(i % 2 != 0){
				for(int j = 0; j <= i; j++)
				{
					System.out.print((char)(temp1 + j));
				}
			}else{
				for(int j = 0; j <= i; j++)
				{
					System.out.print((char)(temp + j));
				}
			}
			System.out.println();
		}
	}

	static void pattern15(int n)
	{
		int temp = 65;
		int count = 1;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 2 * n; j++)
			{
				if(j % 2 == 0){
					System.out.print(count++);
				}else{
					System.out.print((char)(temp++));
				}
			}
		System.out.println();
		}
		}
	public static void main(String[] args) {
		System.out.println("Pattern 1 - ");
		pattern1();
		System.out.println("\nPattern 2 - ");
		pattern2();
		System.out.println("\nPattern 3 - ");
		pattern3();
		System.out.println("\nPattern 4 - ");
		pattern4();
		System.out.println("\nPattern 5 - ");
		pattern5(10);
		System.out.println("\nPattern 6 - ");
		pattern6(5);
		System.out.println("\nPattern 7 - ");
		pattern7();
		System.out.println("\nPattern 8 - ");
		pattern8(5);
		System.out.println("\nPattern 9 - ");
		pattern9();
		System.out.println("\nPattern 10 - ");
		pattern10(4);
		System.out.println("\nPattern 11 - ");
		pattern11(4);
		System.out.println("\nPattern 12 - ");
		pattern12(4);
		System.out.println("\nPattern 13 - ");
		pattern13(4);
		System.out.println("\nPattern 14 - ");
		pattern14(4);
		System.out.println("\nPattern 15 - ");
		pattern15(3);
	}
}

/*
Assignment 53

1. WAP to print below pattern
*
* *
* * *
* * * *
2. WAP to print below pattern
    *
   * *
  * * *
 * * * *
* * * * *
3. WAP to print below pattern
        *
      * *
    * * *
  * * * *
* * * * *
4. WAP to print below pattern
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
TECHNOCREDITS Java Pattern Printing 9765463742
5. WAP to print below pattern
* * * * *
* * * *
* * *
* *
*
6. WAP to print below pattern
* * * * *
 * * * *
  * * *
   * *
    *
7. WAP to print below pattern
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
8. WAP to print below pattern
*
**
***
****
*****
****
***
**
*
TECHNOCREDITS Java Pattern Printing 9765463742
9. WAP to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

11. WAP to print below pattern
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
12. WAP to print below pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
TECHNOCREDITS Java Pattern Printing 9765463742
13. WAP to print below pattern
10101
01010
10101
01010
10101
14. WAP to print below pattern
A
A B
A B C
A B C D
A B C D E
A B C D E F
15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I
16. WAP to print below pattern
A
ab
ABC
abcd
*/
