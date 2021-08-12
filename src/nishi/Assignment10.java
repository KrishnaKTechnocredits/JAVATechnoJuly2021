package nishi;

public class Assignment10 {	
	int count=0;
	float sum=0;
	float avg=0;
	
	void printNumberIsPrime(int number)
	{
		boolean flag=false;
		for(int i=2;i<number;i++)
		{
			if(number%i == 0)
				flag=true;				
		}
		if(!flag)
		{
			System.out.println(number+" is Prime");
			count++;
			sum+=number;			
			avg=sum/count;			
		}
	}
	
	void printPrimeInRange(int startIndex,int endIndex)
	{
		for(int i=startIndex;i<=endIndex;i++)
		{
			printNumberIsPrime(i);
		}
		System.out.println("Total count pf Prime no is "+count);
		System.out.println("Sum of nos is "+sum);
		System.out.println("Avg of nos is "+avg);
	}	

	public static void main(String[] args)
	{
		Assignment10 assignment10 = new Assignment10();
		assignment10.printNumberIsPrime(4);
		assignment10.printPrimeInRange(100,120);
		
	}
}
