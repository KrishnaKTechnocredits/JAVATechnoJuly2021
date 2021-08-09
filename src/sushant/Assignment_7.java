/*Write only one program having following methods. [7 methods in same program] 

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
/*Output : Divisible by 7 or 13, numbers are:
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
         11*/

package sushant;


public class Assignment_7{

	void printEvenNumbers(int startIndex1, int endIndex1) {
		System.out.println("Even Numbers between " + startIndex1 + " and " + endIndex1 + " :");
		for (int index = startIndex1; index <= endIndex1; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void printNumbersDivisibleBy5(int startIndex2, int endIndex2) {
		System.out.println("Numbers divisible by 5 between " + startIndex2 + " and " + endIndex2 + " :");
		for (int index = startIndex2; index <= endIndex2; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void printNumbersDivisibleBy3And5(int startIndex3, int endIndex3) {
		System.out.println("Numbers divisible by 5 & 3 between " + startIndex3 + " and " + endIndex3 + " :");
		for (int index = startIndex3; index <= endIndex3; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void printNumbersDivisbleBy7Or13(int startIndex4, int endIndex4) {
		System.out.println("Divisibility for numbers by 7 or 13 between " + startIndex4 + " and " + endIndex4 + " :");
		for (int index = startIndex4; index <= endIndex4; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
	}

	void printSumOfNumbers(int startIndex5, int endIndex5) {
		System.out.println("Sum of numbers from " + startIndex5 + " to " + endIndex5 + " is:");
		int sum = 0;
		for (int index = startIndex5; index <= endIndex5; index++) {
			sum = sum + index;
		}
		System.out.println(sum);
	}

	void printDifferenceBetweenSumOddEvenNumbers(int startIndex6, int endIndex6) {
		int sum1 = 0;
		int sum2 = 0;
		for (int index = startIndex6; index <= endIndex6; index++) {
			if (index % 2 != 0) {
				sum1 = sum1 + index;
			} else if (index % 2 == 0) {
				sum2 = sum2 + index;
			}
		}
		int diff = sum1 - sum2;
		System.out.println("Difference between sum of odd and even numbers ranging from " + startIndex6 + " to " + endIndex6 + " is: " + diff);
	}

	void printOddNumbersReverse(int startIndex7, int endIndex7) {
		System.out.println("Odd Numbers in reverse from " + startIndex7 + " to " + endIndex7 + " are:");
		for (int index = endIndex7; index > startIndex7; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] a) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumbers(10, 15);
		assignment_7.printNumbersDivisibleBy5(10, 30);
		assignment_7.printNumbersDivisibleBy3And5(5, 18);
		assignment_7.printNumbersDivisbleBy7Or13(5, 40);
		assignment_7.printSumOfNumbers(1, 5);
		assignment_7.printDifferenceBetweenSumOddEvenNumbers(3, 9);
		assignment_7.printOddNumbersReverse(10, 20);
	}
}
