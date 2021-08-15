package suruchi;

public class Assignment13_Program3 {

	static int[] output = new int[5];

	int[] getSmallerNumbers(int num) {

		for (int index = 0; index < 5; index++) {
			num--;
			output[index] = num;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment13_Program3 assignment13_Program3 = new Assignment13_Program3();
		System.out.println("5 smaller numbers of the given number 50 are: ");
		output = assignment13_Program3.getSmallerNumbers(50);
		for (int index = 0; index < output.length; index++)
			System.out.println(output[index]);
	}
}