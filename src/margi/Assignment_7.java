package margi;

class Assignment_7{
	
	void evenNumbers(int start, int end){	//even numbers
		System.out.println("Even numbers are: ");
		for(int index = start; index<=end; index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy_5(int start, int end){	//Numbers divisible by 5
		System.out.println("\nDivisible by 5, numbers are: ");
		for(int index = start; index<=end; index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy_3_And_5(int start, int end){	//Numbers divisible by 5 & 3
		System.out.println("\nDivisible by 5 & 3, numbers are: ");
		for(int index = start; index<=end; index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
	void divisibleBy_7_Or_13(int start, int end){	//Numbers divisible by 7 or 13
		System.out.println("\nDivisible by 7 or 13, numbers are: ");
		for(int index = start; index<=end; index++){
			if(index%7==0)
				System.out.println(index + " is divisible by 7");
			else if(index%13==0)
				System.out.println(index + " is divisible by 13");
		}
	}
	
	void sum(int start, int end){	//Sum of all numbers
		int sum=0;
		for(int index = start; index<=end; index++){
			sum = sum + index;
		}
		System.out.println("\nSum is: " + sum);
	}
	
	void diffSumOddEven(int start, int end){	//Difference between sum of odd and even numbers
		int sumOdd=0;
		int sumEven=0;
		int diff;
		for(int index = start; index<=end; index++){
			if(index%2!=0)
				sumOdd = sumOdd + index;
			else
				sumEven = sumEven + index;
		}
		diff = sumOdd - sumEven;
		System.out.println("\nDifference is: " + diff);
	}
	
	void reverseOdd(int start, int end){		//Odd numbers in reverse order
		for(int index = end; index>=start; index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.evenNumbers(10,15);
		assignment_7.divisibleBy_5(10,30);
		assignment_7.divisibleBy_3_And_5(5,18);
		assignment_7.divisibleBy_7_Or_13(5,40);
		assignment_7.sum(1,5);
		assignment_7.diffSumOddEven(3,9);
		assignment_7.reverseOdd(10,20);
	}
}    