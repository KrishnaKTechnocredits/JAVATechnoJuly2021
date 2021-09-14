/* Assignment - 7 : 8th Aug'2021
Write only one program having following methods. [7 methods in same program]
1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are: 10 12 14
   	
2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are: 10 15 20 25 30 
     	
3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are: 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
                          	 7 is divisible by 7
                          	 13 is divisible by 13
                          	 14 is divisible by 7
                          	 21 is divisible by 7
                          	 26 is divisible by 13
                          	 28 is divisible by 7
                          	 35 is divisible by 7
                          	 39 is divisible by 13
                          	 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6

7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19 17 15 13 11
*/

package akanksha_Jain;

public class Assignment_7 {
	void printEvenNumbers(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%2 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy5(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%5 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy5And3(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%5 == 0 && index%3 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy7Or13(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index%13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}
	
	void sum(int startValue, int endValue) {
		int sum=0;
		for(int index=startValue; index<=endValue; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of numbers is: " + sum);
	}
	
	void difference(int startValue, int endValue) {
		int diff, sumEven=0, sumOdd=0;
		for(int index=startValue; index<=endValue; index++) {
			if (index%2 != 0)
				sumOdd = sumOdd + index;
			else
				sumEven = sumEven + index;
		}
		diff= sumOdd - sumEven;
		System.out.println("Difference is: " + diff);
	}
	
	void printOddNumbersReverse(int startValue, int endValue) {
		for(int index=startValue; index>=endValue; index--) {
			if (index%2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		Assignment_7 assignment_7_1 = new Assignment_7();
		System.out.println("Even numbers are:");
		assignment_7_1.printEvenNumbers(10, 15);
		System.out.println("Divisible by 5, numbers are:");
		assignment_7_1.printNumDivBy5(10, 30);
		System.out.println("Divisible by 5 & 3, numbers are:");
		assignment_7_1.printNumDivBy5And3(5, 18);
		System.out.println("Divisible by 7 or 13, numbers are:");
		assignment_7_1.printNumDivBy7Or13(5, 40);
		assignment_7_1.sum(1, 5);
		assignment_7_1.difference(3, 9);
		System.out.println("Odd Numbers in reverse order:");
		assignment_7_1.printOddNumbersReverse(20, 10);
	}
}