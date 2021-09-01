package amol_Pawar.assignment_24;

public class Program_2 {

	void maxRepeatingWord(String input) {

		int maxNumCount = 0;
		String maxRepeatingWord = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = index; innerIndex < arr.length; innerIndex++) {
				if (arr[innerIndex].equals(arr[index])) {

					count++;
				}
			}
			if (count >= maxNumCount) {
				maxNumCount = count;
				maxRepeatingWord = arr[index];
			}
		}
		System.out.println("Max Repeating word for given string is : " + maxRepeatingWord);
		System.out.println(maxRepeatingWord + " word for given string is repeated for : " + maxNumCount + " times");
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		program_2.maxRepeatingWord("Hi Hello Hi Techno Hello Hi");
	}
}
/*
 * Program 2 : Max repeating word with its freq. input : Hi Hello Hi Techno
 * Hello Hi output : Hi -> 3
 */
