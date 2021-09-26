//Assignment - 11 : 13th Aug'2021

//While loop

//Program 1 : 
//Print first N prime numbers.
//N should be passed as parameter in the method.
//Hint : 10 pass as parameter, method should print first 10 prime numbers.

//Program 2 : 
//Write a method to find out required numbers to generate sum more than 100.
//output : 14


package chaitanya;

public class Ass11whileloop {
	
	int count = 0;
	
	boolean ifNumberisPrime(int n) {
		boolean status = true;
		int index = 2;
		while (index < n) {
			if(n%index==0) {
				status = false;
				//System.out.println(number + " is not a prime ");
		        break;
			}
			index++;
		}
		return status;
	}
	
	void printPrimeNumbersuptoaNumber(int uptoanumber) {
		int number = 2 ;
		System.out.println("First " + uptoanumber + " Prime Numbers are : " );
		 while(count < uptoanumber) {
			 if (ifNumberisPrime(number)) {
				 System.out.print(number + " ");
					count++;
			 }
			 	number++;
		 }
		
	}
	
	void requiredCountofNumbersToReachaSum(int totalsum , int startnumber) {
			int sum = 0;
			int number = 0;
			while (sum <= totalsum) {
				sum = sum + startnumber ;
				number ++;
				startnumber++;
			}
	System.out.println("Total  " + number + " numbers required to generate sum more than " + totalsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass11whileloop ass11whileloop = new Ass11whileloop();
		ass11whileloop.printPrimeNumbersuptoaNumber(10);
		System.out.println("\n---------------------\n");
		ass11whileloop.requiredCountofNumbersToReachaSum(100,1);
	}

}
