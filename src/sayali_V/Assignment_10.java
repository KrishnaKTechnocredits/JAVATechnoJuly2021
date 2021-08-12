package sayali_V;

public class Assignment_10
{

	int primesum=0;
	int count=0;
	
	void verifyNumberIsPrime(int number) 
	{
		boolean status=true;
		for(int index = 2;index < number;index++)
		{
			if(number%index==0) //number%2 (2 i.e.index)
			{
				status=false;
				//System.out.println(number + "number is not prime number");
				break;
			}
		}
		if(status)
		{
			System.out.println(number + " number is prime number");
			count=count+1;
			primesum=primesum+number;
		}
	}
	
	void verifyPrimeNumberInRange(int startnumber,int endnumber)
	{
		for(int number = startnumber;number<=endnumber;number++)
		{
		verifyNumberIsPrime(number);
		}
		System.out.println("-----------------------");
	}
	
	void verifyTotalCountOfPrime()//5
	{
		System.out.println("Totalprimenumbercount is:" + count);
		System.out.println("-----------------------");
	}
	

	void verifySumOfAllPrimeNUmbers()//533
	{
		System.out.println("prime sum is:" + primesum);
		System.out.println("-----------------------");
	}
	
	void verifyAvgOfPrimeNumbers()
	{
		System.out.println("AvgOfPrimeNumber is:" + ((float) primesum /count));//533/5=106.6

	}
	
	public static void main(String args[])
	{
		Assignment_10 primenumber=new Assignment_10();
		//primenumber.verifyNumberIsPrime(17);
		primenumber.verifyPrimeNumberInRange(100,120);
		primenumber.verifyTotalCountOfPrime();
		primenumber.verifySumOfAllPrimeNUmbers();
		primenumber.verifyAvgOfPrimeNumbers();
		//System.out.println("end");
	}
}




