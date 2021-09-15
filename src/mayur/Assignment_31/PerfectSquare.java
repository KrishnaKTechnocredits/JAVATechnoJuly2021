/*Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.*/

package mayur.Assignment_31;

public class PerfectSquare {
	
	int getPerfectSquare(int input) {
		int temp = input / 2;
		while (temp != 0) {
			int num = temp * temp;
			if (num == input) {
				return temp;
			}
			temp--;
		}

		return 0;
	}

	void displayResult(int input, int output) {

		if (output > 0) {
			System.out.println(input + " number is perfect square number ");
		} else {
			System.out.println(input + " number not perfect square number");
		}
	}

	public static void main(String[] args) {
		PerfectSquare perfectSquare = new PerfectSquare();
		int input = 25;
		int output = perfectSquare.getPerfectSquare(input);
		perfectSquare.displayResult(input, output);

		int input1 = 20;
		int output1 = perfectSquare.getPerfectSquare(input1);
		perfectSquare.displayResult(input1, output1);

	}

}
