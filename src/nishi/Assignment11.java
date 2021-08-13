package nishi;

public class Assignment11 {
	
	void printNPrimeNumbers(int N)
	{
		int num = 2;
		int count=0;
		System.out.println("The first "+N+" Prime nos are :");
		while(count<N)
		{
			boolean flag=false;
			int i = 2;			
			while(i<num)
			{
				if(num%i==0)
				{
					flag=true;
					break;
				}
				i++;
			}			
			if(!flag)
			{
				count++;
				System.out.println(i);
			}
			num++;
			}		
	}
	
	void printSumMoreThanHundred(int number)
	{
		int sum = 0;
		int i = 1;
		int count=0;
		while(sum<=number)
		{
			sum+=i;
			count++;
			i++;
		}
		System.out.println("Required nos to generate sum more than 100 :"+count);
	}
	

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printNPrimeNumbers(10);
		assignment11.printSumMoreThanHundred(100);
	}

}
