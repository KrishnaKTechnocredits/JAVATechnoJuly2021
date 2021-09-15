package amol_Pawar.assignment_31;

public class Program_1 {

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
			System.out.println(input + " is an prime number");
		else
			System.out.println(input + " is not prime number");
	}

	public static void main(String[] args) {

		Program_1 program_1 = new Program_1();
		program_1.getPerfectNum(6);
	}
}
/*
 * Program 1: verify given number is a perfect number or not. input : 6 output :
 * 6 is a perfect number
 */
