package shreya;

public class Divisibility {

	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("-----print all even numbers on user define range-----");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibilityOf5(int startIndex, int endIndex) {
		System.out.println("-----print all numbers divisible by 5 on user define  range-----");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibilityOf5And3(int startIndex, int endIndex) {
		System.out.println("-----print all numbers which is divisible by 5 and 3 on user define range-----");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(" Numbers divisible by 5 and 3 are " + index);
			}
		}

	}

	void display(int startIndex, int endIndex) {
		System.out.println("-----print all numbers which is divisible by 7 or 13 on user define range-----");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " Divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " Divisible by 13");
			}
		}
	}

	void sumOfNumbers(int startIndex, int endIndex) {
		System.out.println("-----print Find sum of all the numbers in user define range-----");
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of numbers from " + startIndex + " " + "to " + endIndex + " " + "is " + sum);
	}

	void diffOfEvenAndOdd(int startIndex, int endIndex) {
		System.out.println("-----Print difference between sum of odd numbers and even numbers in a given range-----");
		int sumEven = 0;
		int sumOdd = 0;
		int difference;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				sumEven = sumEven + index;
			} else {
				sumOdd = sumOdd + index;
			}
		}
		difference = sumOdd - sumEven;
		System.out.println("Diffrence between the sum of odd and even number is " + difference);

	}

	void numberInReverseOrder(int startIndex, int endIndex) {
		System.out.println("------Print only odd numbers in reverse order-----");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Divisibility divisibility = new Divisibility();
		divisibility.evenNumbers(10, 15);
		divisibility.divisibilityOf5(10, 30);
		divisibility.divisibilityOf5And3(5, 18);
		divisibility.display(5, 40);
		divisibility.sumOfNumbers(1, 5);
		divisibility.diffOfEvenAndOdd(3, 9);
		divisibility.numberInReverseOrder(10, 20);

	}

}
