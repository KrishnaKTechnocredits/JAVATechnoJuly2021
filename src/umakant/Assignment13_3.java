package umakant;

public class Assignment13_3 {

	int[] getSmallerNumbers(int number,int count) {
		int[] output = new int[count];
		for (int index = 0; index < count; index++) {
			number--;
			output[index] = number;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment13_3 assignment13_3 = new Assignment13_3();
		int input = 50;
		int count =5;
		int[] output = assignment13_3.getSmallerNumbers(input,count);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}
