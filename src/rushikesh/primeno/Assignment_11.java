package rushikesh.primeno;

public class Assignment_11 {
	int count = 0;
	boolean checkPrimeNumbers(int num) {
		boolean status=true;
		int index=2;
		while(index<num) {
			
			if(num%index==0) {
				status = false;
				//System.out.println(num +" is not a prime number");
				break;	
			}
			
			index++;
		}
		return status;
	}
	
	void requiredPrimeNumbers(int requiredCount) {
		int number = 2;
		System.out.print("First " + requiredCount + " Prime Numbers are: ");
		while (count < requiredCount) {
			if(checkPrimeNumbers(number)) {
				System.out.print(number + " ");
			count++;
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
		System.out.println("Required "+number+ " numbers to generate sum more than "+requiredSum);
	}

	
	
	public static void main(String[] args) {
		Assignment_11 assignment_11=new Assignment_11();
		assignment_11.requiredPrimeNumbers(10);
		System.out.println("------------");
		assignment_11.requiredNumbersToGenerateSum(100,1);

		
		
	}
		
		
}
	
	
	
	
	
	


