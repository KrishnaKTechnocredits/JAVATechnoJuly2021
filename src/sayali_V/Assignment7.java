package sayali_V;

public class Assignment7 
{
	void Evennumbers(int startindex,int endindex) 
	{
		System.out.println("Even Numbers Are:  ");
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%2==0)	
				System.out.println(index);
		}
		System.out.println("----");
	}
	
	void NumberDivisiblBy5(int startindex,int endindex)
	{
		System.out.println("Divisible By 5 Numbers Are:  ");
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%5==0)
				System.out.println(index);
		}
		System.out.println("-----");
	}
	
	void NumberDivisibleBy5And3(int startindex,int endindex)
	{
		System.out.println("Divisible By 5 and 3 Numbers Are:  :  ");
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%5==0&&index%3==0)
			{
				System.out.println(index);
			}
		}
		System.out.println("-----");
	}
	
	void NumberDivisibleBy7Or13(int startindex,int endindex)
	{
		System.out.println("Divisible By 7 or 13 Numbers Are: ");
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%7==0 ||index%13==0 )
				System.out.println(index);
		}
		System.out.println("----");
	}
	
	void SumOfAllNumbers(int startindex,int endindex)
	{
		System.out.println("sum is: ");
		int sum=0;
		for(int index=startindex;index<=endindex;index++)
		{
			sum=sum+index;
		}
		System.out.println(sum);
		System.out.println("-----");
	}
	
	void DifferenceBetweenSumOfOddNumbersAndSumOfEvenNumbers(int startindex,int endindex)
	{
		System.out.println("Difference between sum of odd nos. and sum of even nos. is :");
		int odd=0;
		int even=0;
		for(int index=startindex;index<=endindex;index++)
		{
			if(index%2==0)
				even=even+index;
			else
				odd=odd+index;
		}
		System.out.println(odd-even);
		System.out.println("------");
	}
	
	void OddNumbersInReverseOrder(int startindex,int endindex)
	{
		System.out.println("odd numbers in reverse order are : ");
		for(int index=endindex;index>=startindex;index--)
		{
			if(index%2!=0)
				System.out.println(index);
		}
		System.out.println("---");
	}
	
	public static void main(String[] args)
	{
		Assignment7 example1=new Assignment7();
		example1.Evennumbers(10,15);
		example1.NumberDivisiblBy5(10,30);
		example1.NumberDivisibleBy5And3(5,18);
		example1.NumberDivisibleBy7Or13(5, 40);
		example1.SumOfAllNumbers(1,5);
		example1.DifferenceBetweenSumOfOddNumbersAndSumOfEvenNumbers(3,9);
		example1.OddNumbersInReverseOrder(10,20);
	}
}

	
	
	
	


