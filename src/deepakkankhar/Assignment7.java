//Assignment 7
package deepakkankhar;

public class Assignment7 {
	int i;
	
	void printEven(int startIndex, int endIndex) {
		System.out.println("Below are the EVEN numbers");
		for(i=startIndex;startIndex<=endIndex;startIndex++ ) {
				if(startIndex%2==0) {
				System.out.println(startIndex);
			}	
		}
	}
	
	void printDivisible5(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("Below are the numbers divisible by 5");
		for(i=startIndex;startIndex<=endIndex;startIndex++) {
			if(startIndex%5==0) {
				System.out.println(startIndex);
			}
		}
	}
	
	void printDivisible5and3(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("Below are the numbers divisible by 5 and 3");
		for(i=startIndex;startIndex<=endIndex;startIndex++) {
			if(startIndex%5==0 && startIndex%3==0) {
				System.out.println(startIndex);
			}
		}
	}
	
	void printDivisible7and13(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(i=startIndex;startIndex<=endIndex;startIndex++) {
			if(startIndex%7==0) {
				System.out.println(startIndex+" is divisible by 7");
			}if(startIndex%13==0) {
				System.out.println(startIndex+" is divisible by 13");
			}
		}
	}
	
	void sum(int startIndex, int endIndex) {
		System.out.println("");
		
		int sum=0;
		for(i=startIndex;startIndex<=endIndex;startIndex++) {
			sum=sum+startIndex;
		}System.out.println("Sum of the numbers: "+sum);
		
	}
	
	void oddEvenSum(int startIndex, int endIndex) {
		System.out.println("");
		int sumEven=0;
		int sumOdd=0;
		for(i=startIndex;startIndex<=endIndex;startIndex++) {
				if(startIndex%2==0) {
					sumEven=sumEven+startIndex;
				}else 
					sumOdd=sumOdd+startIndex;
				
		}
		System.out.println("Sum of the Even numbers: "+sumEven);
		System.out.println("Sum of the Odd numbers: "+sumOdd);
		System.out.println("Difference between sum of odd and even numbers is: "+(sumOdd-sumEven));
	}
	
	void printOddReverse(int startIndex, int endIndex) {
		System.out.println("");
		for(i=endIndex;endIndex>=startIndex;endIndex--) {
			if(endIndex%2!=0) {
				System.out.println(endIndex);
			}
		}
	}
		
	public static void main(String[] args) {
		
		Assignment7 obj1=new Assignment7();
		obj1.printEven(10, 15);
		obj1.printDivisible5(10, 30);
		obj1.printDivisible5and3(5, 18);
		obj1.printDivisible7and13(5, 40);
		obj1.sum(1, 5);
		obj1.oddEvenSum(3, 9);
		obj1.printOddReverse(10, 20);
	}

}
