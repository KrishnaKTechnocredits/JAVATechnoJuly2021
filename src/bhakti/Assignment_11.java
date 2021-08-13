////Assignment - 11 : 13th Aug'2021
//
//While loop
//
//Program 1 : 
//Print first N prime numbers.
//N should be passed as parameter in the method.
//Hint : 10 pass as parameter, method should print first 10 prime numbers.
//
//Program 2 : 
//Write a method to find out required numbers to generate sum more than 100.
//output : 14

package bhakti;

public class Assignment_11 {
	
	//Method 1:   to find n numbers  prime numbers :
	int primeNumberCount=0;
	//Method 1.1: to find if number is prime 	
	void isPrimeNumber(int num) {
		boolean status= false;
		for (int index=2; index < num; index++) {
			if (num % index==0) {
				//System.out.println(num+" is not prime number.");
				status= true;
				break;
			}
		}	
		if (!status) {
			System.out.println(num);
			primeNumberCount++;
		}
	}
	//Method 1.2: main method  to find first "xYZ" prime numbers 	
	void findPrimeNumber(int count) {
		int number=2;
		System.out.println("Frist "+count+ " prime numbers:");
		while (primeNumberCount < count ) {
			isPrimeNumber(number);
			number++;
		}
		System.out.println("----------------------------------------------");
	}
	
	//Method 2>> Write a method to find out required numbers to generate sum more than 100.
	
	
	void numbersRequiredToGenerateSum(int requiredSum) {
		int sum=0;
		int index=0;
		int count=0;
		while (sum <= requiredSum) {
			index++;
			sum = sum+ index;
			//System.out.println(sum);
			count++;
		}
		
		System.out.println("Frist "+count+" numbers are required to have sum more than "+requiredSum);
		System.out.println("----------------------------------------------");
	}	
	
	public static void main(String[] fg) {
		
		Assignment_11 assignment_11= new Assignment_11();
		assignment_11.findPrimeNumber(10);
		assignment_11.numbersRequiredToGenerateSum(100);
	}

}
