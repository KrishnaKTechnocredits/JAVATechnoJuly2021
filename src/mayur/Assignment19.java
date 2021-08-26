package mayur;

public class Assignment19 {
	
	void getNumberOfWords(String input) {
		String arr[] = input.split(" ");
		System.out.println("Total number of words are: " + arr.length);
	}

	void getMaxWordLength(String input) {
		int temp = 0;
		String arr[] = input.split(" ");
		int stringLength = 0;
		String maxString = "";
		for (int index=0; index < arr.length; ++index) {
			stringLength = arr[index].length();
			if (temp < stringLength) {
				temp = stringLength;
				maxString = arr[index];
			}
		}
		System.out.println("Max string is - " + maxString + " - which having total length " + temp);
	}

	void getMinWordLength(String input) {
		String arr[] = input.split(" ");
		int min = arr[0].length();
		String minString = arr[0];
		for (int index = 0; index < arr.length; index++) {

			if (arr[index].length() < min) {
				min = arr[index].length();
				minString = arr[index];
			}
		}
		System.out.println("Minimum string is - " + minString + " - which having length " + min);
	}

	void getSumOfAllNumbers(String input) {
		int temp = 0;
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			int num = Integer.valueOf(str[index]);
			temp = temp + num;
		}
		System.out.println("Sum of " + input + " is = " + temp);
	}

	public static void main(String[] args) {

		Assignment19 assignment19 = new Assignment19();
		String input = "Hi Techno Credits Hello";
		assignment19.getNumberOfWords(input);
		String word = "good morning technocredits hi hello";
		assignment19.getMaxWordLength(word);
		assignment19.getMinWordLength(word);
		String str = "10 10 20 30";
		assignment19.getSumOfAllNumbers(str);
	}

}
