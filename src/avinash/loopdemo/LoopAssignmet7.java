package avinash.loopdemo;

public class LoopAssignmet7 {

	void display(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println("The even numbers between 10 to 15:" + index);
		}
	}

	void numbersDivisblebyFive(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println("10 to 30 numbers which are divisible by 5:" + index);
		}
	}

	void numbersDivisblebyFiveandThree(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {

			if (index % 3 == 0 && index % 5 == 0)
				System.out.println("number divisible by 3 and 5 is:"+index);
		}
	}

	void numberdivbySevenorThirteen(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0 && index % 13 == 0) {
				System.out.println(index + ":is divisible by 7");
			} else if (index % 7 == 0) {
				System.out.println(index + ":is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + ":is divisible by 13");
			}
		}

	}

	void sumofAlltheNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++)

			sum = sum + index;
		System.out.println("sum of numbers from " + startIndex + " to " + endIndex + " is: " + sum);
	}

	void sumofOddandEven(int startIndex, int endIndex) {
		int sumO = 0, sumE = 0;
		for (int index = startIndex; index <= endIndex; index++)
			if (index % 2 == 0)
				sumE = sumE + index;
			else
				sumO = sumO + index;
		int total = sumO - sumE;
		System.out.println("Difference of odd and even number is:" + total);
	}

	void oddNumberReverse(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 == 1)
				System.out.println("Odd number 10 to 20 reverse order:"+index);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopAssignmet7 loopAssignment7 = new LoopAssignmet7();
		loopAssignment7.display(10, 15);
		loopAssignment7.numbersDivisblebyFive(10, 30);
		loopAssignment7.numbersDivisblebyFiveandThree(5, 18);
		loopAssignment7.numberdivbySevenorThirteen(5, 40);
		loopAssignment7.sumofAlltheNumbers(1, 5);
		loopAssignment7.sumofOddandEven(3, 9);
		loopAssignment7.oddNumberReverse(10, 20);
	}

}
