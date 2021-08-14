package indu;

public class Assignment_11 {
	
	void printPrimeNUmber(int num)
	{
		System.out.println("The first " + num + " prime numbers are : ");
		
		int count= 0;
		int number = 2;
		
		while(count < num)
		{
			boolean flag=true;
			int index = 2;
			while(index < number )
			{
				if(number % index == 0)
				{
					flag = false;
					break;
				}
				
				index++;
			}
			if(flag)
			{
				System.out.println(index);
				count++;
			}
			number++;			
		}	
	}
	
	void printSumMoreThanParameterNum(int number)
	{
		int sum = 0;
		int num = 1;
		int count = 0;
		while(sum <= number)
		{
			sum += num;
			count++;
			num++;
		}
		System.out.println("Required numbers  to generate sum more than "+ number + " : " + count);
	}
	
	public static void main(String args[])
	{
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printPrimeNUmber(13);
		assignment_11.printSumMoreThanParameterNum(100);
		assignment_11.printSumMoreThanParameterNum(50);
	}
	
}
