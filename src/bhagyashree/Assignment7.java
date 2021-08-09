package bhagyashree;

public class Assignment7 {
	
	void printEventNumber(int startindex,int endindex)
	{
		System.out.println("Even numbers are:  ");
		for(int index=startindex;index<=endindex;index++)
		{
			
		if(index%2==0)
		{
			System.out.println(index);
			
		}
		
		}	
		System.out.println("--------------------------------------------------");
		
	}// to print even numbers between 10 15
	
	void printDivisibleByFiveNumbers(int startindex,int endindex)
	{
		System.out.println("Numbers Divisible by 5 are:  ");
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%5==0)
			{
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------------------------");
	}//to print number divisible by 5 between 10 to 30
	
	void printDivisibleByFiveandThreeNumbers(int startindex,int endindex)
	{
		
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%3==0 && index%5==0)
			{
			System.out.println("Numbers Divisible by 5 and 3:   "+index);
			}
		}
		System.out.println("--------------------------------------------------");
	}//to print number divisible by 5 and 3
	
	void printDivisibleBySevenorThirteen(int startindex,int endindex)
	{
		for(int index=startindex;index<=endindex;index++)
		{
				if(index%7==0)
				{
					System.out.println(index+"  is divisible by 7   ");
				}
				else if(index%13==0)
				{
					System.out.println(index+"   is divisible by 13   ");
				}
		}
		System.out.println("--------------------------------------------------");
	}//no is divisible by 7 or 13
	
	void sumOfNumber(int startindex,int endindex)
	{
		int sum=0;
		for(int index=startindex;index<=endindex;index++)
		{
			sum=sum+index;
			//System.out.println("Sum of All numbers in user defined range is:   "+sum);
		}
		System.out.println("Sum of All numbers in user defined range is:   "+sum);
		System.out.println("--------------------------------------------------");
	}// sum of numbers within range
	
	void sumOddEvenNumber(int startindex,int endindex)
	{
		int evensum=0;
		int oddsum=0;
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%2==0)
			{
				evensum=evensum+index;
				System.out.println("Sum of Even Numbers is:  "+evensum);
			}
			else if(index%2!=0)
			{
				oddsum=oddsum+index;
				System.out.println("SUm of Odd Numbers is:  "+oddsum);
			}
		}
		System.out.println("Diffrenece between Even and Odd sum:   "+(oddsum-evensum));
		System.out.println("--------------------------------------------------");
	}//print difference between odd and even sum
	
	void printReverseOddNumber(int startindex,int endindex)
	{
		System.out.println("Odd numbers between 10 to 20 in reverse order:   ");
		for(int index=startindex;index>=endindex;index--)
		{
			if(index%2!=0)
			{
				System.out.println(index);
			}
		}
	}//print reverse odd number within range
	
	
	public static void main(String[] args)
	{
		Assignment7 assignment7=new Assignment7();
		assignment7.printEventNumber(10,15);
		
		Assignment7 assignment7_1=new Assignment7();
		assignment7_1.printDivisibleByFiveNumbers(10,30);
		
		Assignment7 assignment7_2=new Assignment7();
		assignment7_2.printDivisibleByFiveandThreeNumbers(5,18);
		
		Assignment7 assignment7_3=new Assignment7();
		assignment7_3.printDivisibleBySevenorThirteen(5,40);
		
		Assignment7 assignment7_4=new Assignment7();
		assignment7_4.sumOfNumber(1,5);
		
		Assignment7 assignment7_5=new Assignment7();
		assignment7_5.sumOddEvenNumber(3,9);
		
		Assignment7 assignment7_6=new Assignment7();
		assignment7_6.printReverseOddNumber(20,10);
			
	}

}
