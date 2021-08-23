package chandni_bhoj;

public class Assignment_19 {

	void getTotalWords (String input) {
		String [] arr = input.split(" ");
		System.out.println (arr.length);
	}

	void getMaxLengthWord (String input) {
		String [] arr = input.split(" ");
		String maxWord = arr[0];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxWord.length()) {
				maxWord = arr[index];
			}
		}
		System.out.println (maxWord);
		
	}
		
		void getMinLengthWord (String input) {
			String [] arr = input.split(" ");
			String minWord = arr[0];
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < minWord.length()) {
				minWord = arr[index];
		
			}
		}
		System.out.println (minWord);

	}

		void getSumOfAllNumbers (String input) {
			String [] output = input.split(" ");
			int sum = 0;
			for (int index = 0; index < output.length; index++) {
				sum += Integer.parseInt(output[index]);
			}
			System.out.println (sum);
		}

	public static void main(String[] args) {
		Assignment_19 assignment_19 = new Assignment_19 ();
		assignment_19.getTotalWords("Hi Techno Credits Hello");
		assignment_19.getMaxLengthWord("good morning technocredits hi hello");
		assignment_19.getMinLengthWord("good morning technocredits hi hello");
		assignment_19.getSumOfAllNumbers("10 10 20 30");
	}

}
