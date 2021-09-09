/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number*/

package mayur.Assignment_31;

public class PerfectNumber {
	
	void getPerfectNum(int input) {
		int temp = input / 2;
		int num = 0;
		while (temp != 0) {
			if (input % temp == 0) {
				num = num + temp;
			}
			temp--;
		}
		if (num == input)
			System.out.println(input + " is a perfect number");
		else
			System.out.println(input + " is a perfect number");
	}

	public static void main(String[] args) {

		PerfectNumber perfectNumber = new PerfectNumber();
		perfectNumber.getPerfectNum(6);
	}

}
