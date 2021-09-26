/*
WAP that will return difference of even  length  name and odd length name. arr[0]="Maulik" ,arr[1]="Techno" ,arr[2]="Nidhi", arr[3]="Ankit" output:2
*/
package sayali_V;

public class Assignment15_1 {

	static int x = 10;

	int getDiffofEvenLengthNameAndOddLengthName(String[] input) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				sumEven += input[index].length();
			} else {
				sumOdd += input[index].length();
			}
		}
		return sumEven - sumOdd;
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Techno", "Nidhi", "Ankit" };
		Assignment15_1 assignment = new Assignment15_1();
		System.out.println("difference of evenlength name and oddlength name is :"
				+ assignment.getDiffofEvenLengthNameAndOddLengthName(input));
	}

}
