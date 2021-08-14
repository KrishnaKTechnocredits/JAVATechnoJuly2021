package pranita;

public class Assignment_11 {
	
	int sum ,totalSum , count;
	
	void numberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index <=number-1; index++) {
			if (number % index == 0) {
				status = false;
			
			break;
				
	      }
			 
	}
		if (status) {
			System.out.println(number + " is a prime number");
			count++;
		}
	}

	void printNPrimeNumbers(int range) {
		int index = 1; 
		while (count < range) {
			numberIsPrime(index);
			index++;
			  
		}
	}

	void totalSum(int number) {
		int index = 1;
		int count=0;
		while (sum <= number) {
			sum = sum + index;
			index++;
			count++;
			 
		}
		System.out.println("Total number required for sum  " +count);
	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printNPrimeNumbers(10);
		assignment_11.totalSum(100);
	}
}

