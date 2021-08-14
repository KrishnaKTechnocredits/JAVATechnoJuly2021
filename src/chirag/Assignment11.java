package chirag;

public class Assignment11 {

	int primeNumberCount = 0;
	boolean verifyNumberisPrime(int number)
	{
		boolean status=true;
		int index = 2;
		while(index < number)
		{
			if(number % index == 0)
			{
				status=false;
				break;
			}
			index++;	
		}
		return status;
	}
	void requiredPrimeNumbers(int requiredPrimeNumberCount) {
		int number = 2;
		System.out.print("First " + requiredPrimeNumberCount + " Prime Numbers are: ");
		while (primeNumberCount < requiredPrimeNumberCount) {
			if(verifyNumberisPrime(number)) {
				System.out.print(number + " ");
			primeNumberCount++;
			}
			number++;
		}
	}
	
	void requiredNumbersToGenerateSum(int requiredSum, int startIndex) {
		int sum=0;
		int number=0;
		while(sum<=requiredSum) {
			sum=sum+startIndex;
			number++;
			startIndex++;
		}
		System.out.println("Required "+number+" numbers to generate sum more than "+requiredSum);
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11=new Assignment11();
		assignment11.requiredPrimeNumbers(10);
		System.out.println();
		assignment11.requiredNumbersToGenerateSum(100,1);
	}
}