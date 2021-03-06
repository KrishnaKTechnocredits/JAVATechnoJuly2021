package kalpesh;

public class Assignment_24_Program_2 {
	void getWordsCount(String input) {
		int count = 0, maxCount = 0;
		String[] arr = input.split(" ");
		String maxRepeatWord = "", temp;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			temp = arr[index];
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (temp.equals(arr[index1]))
					count++;
			}
			if (maxCount < count) {
				maxCount = count;
				maxRepeatWord = arr[index];
			}
		}
		System.out.println(maxRepeatWord + " -> " + maxCount);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		Assignment_24_Program_2 program_2 = new Assignment_24_Program_2();
		program_2.getWordsCount(input);
	}
}

/*
 * Program 2 : Max repeating word with its freq. input : Hi Hello Hi Techno
 * Hello Hi output : Hi -> 3
 */
