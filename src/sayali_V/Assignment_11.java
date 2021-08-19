package sayali_V;

public class Assignment_11 
{
	boolean verifyPrimeNumber(int number)
	{
		boolean status=true;
		int index=2;
		while(index<number)
		{
			if(number%index==0)
			{
				status = false;
				break;	
			}
			index++;
		}
		if(status) 
		{
			System.out.print(number+ "  ");
		}
		return status;
	}
			
	void verifyprimeNumbers(int Range)
	{
		int primeCount=0;
		int number=2;
		while(primeCount!=Range)
		{
			if(verifyPrimeNumber(number))
			{
				primeCount++;
			}
			number++;
		}
	}
		
	void verifyCount(int range)
	{
		int num1=1;
		int sum=0;
		int totalcount=0;
		while(sum<range)
		{
			sum=sum+num1;
			num1=num1+1;
			totalcount++;
		}
		System.out.print("Total count is :" +totalcount);
	}

	public static void main(String args[])
	{
		Assignment_11 Primeno=new Assignment_11();
	//	Primeno.verifyPrimeNumber(17);
		System.out.println("First 10 prime numbers are:");
		Primeno.verifyprimeNumbers(10);
		System.out.println(" ");
		Primeno.verifyCount(100);
	}
}


