package shweta_Dharmadhikari.string_assignment28;

public class RepetingWordInGivenString {
	int index_1 = 0, index = 0;

	void countOfRepetingWord(String input) {
		String[] output = input.split(" ");
		int totalCount = 0;
		String repetingWord = "";
		for (index = 0; index < output.length; index++) {
			int count = 1;
			for (index_1 = index + 1; index_1 < output.length; index_1++) {
				if (output[index_1].equals(output[index])) {
					count++;
				}
			}
			if (count > totalCount) {
				totalCount = count;
				repetingWord = output[index];
			}

		}
		System.out.println(repetingWord + " -> " + totalCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Hello Hi Techno Hello Hi";
		RepetingWordInGivenString repetingWordInGivenString = new RepetingWordInGivenString();
		repetingWordInGivenString.countOfRepetingWord(input);
	}

}
