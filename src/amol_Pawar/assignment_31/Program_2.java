package amol_Pawar.assignment_31;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Program_2 {

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
		Program_2 program_2 = new Program_2();
		int input = 25;
		int output = program_2.getPerfectSquare(input);
		program_2.displayResult(input, output);

		int input1 = 20;
		int output1 = program_2.getPerfectSquare(input1);
		program_2.displayResult(input1, output1);

	}

}
