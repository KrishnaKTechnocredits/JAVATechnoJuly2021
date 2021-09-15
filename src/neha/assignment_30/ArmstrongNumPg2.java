package neha.assignment_30;

/*Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
For example, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371 */
public class ArmstrongNumPg2 {
	void findAndDisplayArmstrongNum(int num) {
		int tempNum = num;
		int sum = 0;
		while (tempNum > 0) {
			sum += Math.pow(tempNum % 10, 3);
			tempNum = tempNum / 10;
		}
		if (sum == num)
			System.out.println("Number " + num + " is a armstrong number");
		else
			System.out.println("Number " + num + " is not a armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumPg2 armstrongNumPg2 = new ArmstrongNumPg2();
		int num = 371;
		armstrongNumPg2.findAndDisplayArmstrongNum(num);
		num = 234;
		armstrongNumPg2.findAndDisplayArmstrongNum(num);
	}
}
