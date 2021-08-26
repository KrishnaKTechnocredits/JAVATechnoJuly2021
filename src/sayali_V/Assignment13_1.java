/*return count of positive numbers from given array.int[] input={1,-11,-44,23,55,-99,-23,-22};
 number of zero's in given array.int[] input={1,11,0,0,55,0,-23,0};
 Write a method which returns 5 smaller numbers of the given number. input:50 output:49,48,47,46,45
  */
 package sayali_V;

public class Assignment13_1 
{
	int[] input1= {1,-11,-44,23,55,-99,-23,-22};
	int[] input2= {1,-11,0,0,55,0,-23,0};
	
	void countOfPositiveNumbers()
	{
		int cnt=0;
		for(int index=0;index<input1.length;index++)
		{
			if(input1[index]>0)
			{
				cnt=cnt+1;
			}
		}
		System.out.println(cnt);
	}
	
	void countNumberOfZeros()
	{
		int cnt=0;
		for(int index=0;index<input2.length;index++)
		{
			if(input2[index]==0)
			{
				cnt=cnt+1;
			}
		}
		System.out.println(cnt);
	}
	
	int smallerNumbers(int num)
	{
			int input[]=new int[5];
		
		for(int index=0;index<5;index++)
		{
			num--;
			System.out.println(num);
		}
	return num;
	}
	
	public static void main(String[] args)
	{
	Assignment13_1 assignment=new Assignment13_1();
	System.out.println("count of positive nos :");
	assignment.countOfPositiveNumbers();
	System.out.println("Number of zeros :");
	assignment.countNumberOfZeros();
	System.out.println("5 smaller numbers of the given number:");
	assignment.smallerNumbers(50);
	}
}
