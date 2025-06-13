package tarangAssignment31;

/*Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number
input : 50
output : 50 is not a perfect number
Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.
input : 20
output : 20 is not a perfect square.
Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------*/
public class PerfectNumber {

	boolean isPerfectNumber(int input) {
		int sum = 0;
		for (int num = 1; num < input; num++) {
			if (input % num == 0) {
				sum = sum + num;
			}
		}
		if (input == sum) {
			return true;
		} else {
			return false;
		}
	}

	void display(int num) {
		if (isPerfectNumber(num)) {
			System.out.println(num + " is a perfect number");
		} else {
			System.out.println(num + " is not a perfect number");
		}
	}

	void isPerfectSquare(int input) {
		boolean flag = false;
		for (int num = 1; num < input; num++) {
			if (input % num == 0 && ((num * num) == input)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(input + " is a perfect square");
		} else {
			System.out.println(input + " is not a perfect square");
		}
	}

	void getPerfectNumberInRange(int startNum, int endNum) {
		for (int index = startNum; index < endNum; index++) {
			if (isPerfectNumber(index)) {
				System.out.println(index + " is a perfect number");
			}
		}
	}

	int getCountTriplets(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if ((input[index + 1] - input[index] == 1) && (input[index + 2] - input[index] == 2)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		PerfectNumber p1 = new PerfectNumber();
		p1.display(8);
		p1.display(28);
		p1.isPerfectSquare(46);
		p1.isPerfectSquare(25);
		p1.getPerfectNumberInRange(1, 200);
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		System.out.println("No. of triplets in the array is " + p1.getCountTriplets(arr));

	}
}
