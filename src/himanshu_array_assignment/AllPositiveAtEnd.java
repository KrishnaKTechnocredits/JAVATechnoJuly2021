package himanshu_array_assignment;

public class AllPositiveAtEnd {

	void allPositiveAtEndMtd(int[] input) {

		int[] output = new int[input.length];
		int count = 0;
		int zeroCnt = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[count] = input[i];
				count++;
			} else if (input[i] == 0) {
				zeroCnt++;
			}

		}
		int positiveStartIndex = count + zeroCnt;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[positiveStartIndex] = input[index];
				positiveStartIndex++;
			}
			System.out.print(output[index] + ",");
		}

	}

	public static void main(String[] args) {

		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };

		AllPositiveAtEnd assignemnt33_3 = new AllPositiveAtEnd();
		assignemnt33_3.allPositiveAtEndMtd(input);
	}
}
