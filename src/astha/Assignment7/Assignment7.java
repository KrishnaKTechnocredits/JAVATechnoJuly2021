package astha.Assignment7;

public class Assignment7 {
	
//On user define range print all even numbers. 	
	void printEvenNumbers(int startIndex,int endIndex) {
		System.out.println("Even numbers between "+startIndex+" and "+endIndex+" :");
		for(int i=startIndex;i<=endIndex;i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
//On user define range print all numbers which is divisible by 5. 	
	void printNumbersDivisibleBy5(int startIndex,int endIndex) {
		System.out.println("Number divisible by 5 between "+startIndex+" and "+endIndex+" :");
		for(int i=startIndex;i<=endIndex;i++) {
			if (i%5 == 0) {
				System.out.println(i);
			}
		}
	}
	
//On user define range print all numbers which is divisible by 5 and divisible by 3. 	
	void printNumbersDivisibleBy5And3(int startIndex,int endIndex) {
		System.out.println("Number divisible by 5 and 3 between "+startIndex+" and "+endIndex+" :");
		for(int i=startIndex;i<=endIndex;i++) {
			if (i%3 == 0 && i%5 ==0){
				System.out.println(i);
			}
		}
	}
	
//On user define range print all numbers which is divisible by 7 or 13. 	
	void printNumbersDivisibleBy7Or13(int startIndex,int endIndex) {
		for(int i=startIndex;i<=endIndex;i++) {
			if(i%7 == 0)
				System.out.println(i+" is divisible by 7");
			else if (i%13 == 0)
				System.out.println(i+" is divisible by 13");
		}
	}

//Find sum of all the numbers in user define range.	
	void sumOfNumbers(int startIndex,int endIndex) {
		int sum =0;
		for(int i=startIndex;i<=endIndex;i++) {
			sum+= i;
		}
		System.out.println("Sum is "+sum);
	}
	
//Find difference between sum of odd numbers and even numbers in a given range		
	void differenceOfOddAndEvenNumbers(int startIndex,int endIndex) {
		int oddSum = 0;
		int evenSum = 0;
		for(int i=startIndex;i<=endIndex;i++) {
			if(i%2==0)
				evenSum+= i;
			else
				oddSum+= i;
		}
		int diff = oddSum-evenSum;
		System.out.println("Difference between sum of odd numbers and even numbers : "+diff);
	}
	
//Print only odd numbers in reverse order.	
	void printOddNumbers(int startIndex,int endIndex) {
		System.out.println("Odd numbers in reverse order");
		for(int i=endIndex;i>=startIndex;i--) {
			if(i%2 != 0)
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumbers(10,15);
		assignment7.printNumbersDivisibleBy5(10,30);
		assignment7.printNumbersDivisibleBy5And3(5,18);
		assignment7.printNumbersDivisibleBy7Or13(5,40);
		assignment7.sumOfNumbers(1,5);
		assignment7.differenceOfOddAndEvenNumbers(3,9);
		assignment7.printOddNumbers(10,20);
	}
}
