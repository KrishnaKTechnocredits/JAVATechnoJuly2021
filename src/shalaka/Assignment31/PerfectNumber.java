/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number


Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */
package shalaka.Assignment31;

public class PerfectNumber {
	boolean isPerfectNumber(int num) {
		int sum = 1;
		int orignalNum = num;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == orignalNum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int number1 = 50;
		PerfectNumber perfectNumber = new PerfectNumber();
		boolean isPerfect = perfectNumber.isPerfectNumber(number);
		if (isPerfect)
			System.out.println(number + " is Perfect a Number");
		else
			System.out.println(number + " is not perfect a Number");
		PerfectNumber perfectNumber1 = new PerfectNumber();
		boolean isPerfect1 = perfectNumber1.isPerfectNumber(number1);
		if (isPerfect1)
			System.out.println(number1 + " is Perfect a Number");
		else
			System.out.println(number1 + " is not perfect a Number");
	}
}
