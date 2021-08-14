//Assignment - 10 : 12th Aug'2021
//
//Create a class to satisfy below requirements. 
//                  a) Print Number is prime if Given number is prime. (parameterized method)
//                  b) Print all the prime numbers between range 100->120. (parameterized method)
//                  c) Print total count of prime numbers between 100->120.
//                  d) Find sum of all prime numbers between 100->120
//                  e) Find avg of prime numbers between 100->120
package bhakti;

public class Assignment_10_primNo {
	
	int sumOfPrimeNo;
	int primeCount=0;
	
	void isNumberPrime(int number){
		boolean status= false;
		
		for( int index =2; index < number ; index++){
			if (number % index ==0){
				System.out.println (number+ "  is not prime number");
				status= true;
				break;
			}	
		}
		if (!status){
			System.out.println (number+ "  is prime number");
			primeCount++;
			sumOfPrimeNo=sumOfPrimeNo+number;
		}
	}

	void prime_nonprimeNumberInRane (int startRange, int endRange){
		for (int num = startRange; num <= endRange; num++){
			 isNumberPrime(num);
		}	
	System.out.println("------------------------------------");	
	}
	
	void countofPrimeNumber(){
		System.out.println("Total prime number are: "+primeCount);
		System.out.println("------------------------------------");
	}
	
	void sumOfPrimeNo(){
		System.out.println("Sum of prime number: "+sumOfPrimeNo);
		System.out.println("------------------------------------");
	}
	
	void avrageOfPrimeNumber(){
		float avg= sumOfPrimeNo/primeCount;
		System.out.println("Avarage of prime number is: "+avg);
		System.out.println("------------------------------------");
	}	
	
	public static void main(String[]ang) {
		Assignment_10_primNo assignment_10_primNo =new Assignment_10_primNo();
		assignment_10_primNo.prime_nonprimeNumberInRane(2,15);
		assignment_10_primNo.countofPrimeNumber();
		assignment_10_primNo.avrageOfPrimeNumber();
		assignment_10_primNo.sumOfPrimeNo();
			
	}
	
}
