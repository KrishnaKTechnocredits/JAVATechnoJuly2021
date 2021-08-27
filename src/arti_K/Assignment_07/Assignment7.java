/* Assignment - 7 : 8th Aug'2021

Write only one program having following methods. [7 methods in same program] 

1. On user define range print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

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
output : 19
         17
         15
         13
         11
  */

package arti_K.Assignment_07;

public class Assignment7 {

	void printEvenNum(int startNum, int endNum) {
		System.out.println("Even Number are : ");
		for (int index = startNum; index <= endNum; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void printNumDivisibleby5(int startNum, int endNum) {
		System.out.println("\nNumbers Divisible by 5 are : ");
		for (int index = startNum; index <= endNum; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void printNumdivisiblebyThreeandFive(int startNum, int endNum) {
		System.out.println("\nNumber Divisible by 5 and 3 is : ");

		for (int index = startNum; index <= endNum; index++) {

			if (index % 3 == 0 && index % 5 == 0)
				System.out.println(index);
		}
	}

	void printNumdivisibleby7and13(int startNum, int endNum) {
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for (int index = startNum; index <= endNum; index++) {

			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7.");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13.");
		}
	}

	void sumOfAllnum(int startNum, int endNum) {
		int sum = 0;
		for (int index = startNum; index <= endNum; index++) {
			sum = sum + index;
		}
		System.out.println("\nSum is : " + sum);
	}

	void sumOfEvenOdd(int startNum, int endNum) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = startNum; index <= endNum; index++) {
			if (index % 2 == 0)
				evenSum = evenSum + index;
			else
				oddSum = oddSum + index;
		}
		System.out.println("\nEven Numbers Sum is : " + evenSum);
		System.out.println("Odd Numbers Sum is : " + oddSum);
		if (evenSum > oddSum)
			System.out.println("Difference between EvenSum and OddSum is : " + (evenSum - oddSum));
		else
			System.out.println("difference between EvenSum and OddSum is : " + (oddSum - evenSum));
	}

	void printOddnumber(int startNum, int endNum) {
		System.out.println("\nOdd Number from 10 to 20 in reverse order are :");
		for (int index = startNum; index >= 10; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNum(10, 15);
		assignment7.printNumDivisibleby5(10, 30);
		assignment7.printNumdivisiblebyThreeandFive(5, 18);
		assignment7.printNumdivisibleby7and13(5, 40);
		assignment7.sumOfAllnum(1, 5);
		assignment7.sumOfEvenOdd(3, 9);
		assignment7.printOddnumber(20, 10);
	}

}
