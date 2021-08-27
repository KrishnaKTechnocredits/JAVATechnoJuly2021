package shweta_Dharmadhikari.string_count;

import java.util.Scanner;

public class SumOfGivenNumber {

	int getSumOfNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		String str = scan.nextLine();
		String output[] = str.split(" ");
		int sum = 0;
		for (int index = 0; index < output.length; index++) {
			sum += Integer.parseInt(output[index]);
		}
		scan.close();
		return sum;

	}

	public static void main(String[] args) {
		SumOfGivenNumber sumOfGivenNumber = new SumOfGivenNumber();
		System.out.println("Output : " + sumOfGivenNumber.getSumOfNumbers());
	}

}
