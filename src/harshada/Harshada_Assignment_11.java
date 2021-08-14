/*Assignment - 11 : 13th Aug'2021
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
output : 14
 
 */

package harshada;

public class Harshada_Assignment_11 {
		
	static int count;
	
	void findFirstNPrimeNumbers(int nPrimeNo) {
		int primeNoToCheck=2;
		int maxlimit=100;
		System.out.println("First "+ nPrimeNo +" Prime Numbers are: ");
		while(primeNoToCheck <= maxlimit) {
			if(count<nPrimeNo) {
				verifyIsNumberPrime(primeNoToCheck);
				
			}
			primeNoToCheck++;
		}
	}
		
	void verifyIsNumberPrime(int number) {
		boolean status=true;
		
		for(int index=2; index<number; index++) {
			if(number%index==0) {
				status=false;
			}
		}
		if(status) {
			System.out.print(number+"\t");
			count++;
		}
	}
		
	void requiredNumbersToGenerateSum(int requiredSum, int startIndex) {
		int sum=1;
		int number=0;
		while(sum<=requiredSum) {
			sum=sum+startIndex;
			number++;
			startIndex++;
		}
		System.out.println("\n\nRequired "+number+ " numbers to generate sum of more than "+requiredSum+" !");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harshada_Assignment_11 assignment_11=new Harshada_Assignment_11();
		assignment_11.findFirstNPrimeNumbers(10);
		assignment_11.requiredNumbersToGenerateSum(100,1);
		//System.out.println("End");

	}

}

