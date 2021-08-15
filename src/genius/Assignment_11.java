package genius;

public class Assignment_11{
	int primeCount;
	
	void findPrimeNumber(int number) {
		int index=2;
		boolean status = true;
		while(index<number) {
			if(number % index ==0) {
				status=false;
				break;
			}
			index++;
		}
		if(number==1)
			status=false;
		if(status) {
			System.out.println(number + " is a prime number");
		    primeCount++;
	    }
	}
	
	void firstNPrimeNumber(int range) {
		int index=1;
		while(primeCount<range) {
			findPrimeNumber(index);
			index++;
		}
	}
	
	void reqNumToGenerateSumMoreThan100(int range) {
		int sum=0;
		int number=1;
		int numCount=0;
		while(sum<range) {
			sum=sum+number;
			numCount++;
			number++;
		}
		System.out.println("Total Required Numbers to generate sum more than 100 is "+numCount);
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.firstNPrimeNumber(10);
		assignment_11.reqNumToGenerateSumMoreThan100(100);
		
	}
}