package shantanu.numberOfVowels_repeatingWord_assignment24;

public class RepeatingWordAndCount {
	int getCountOfEachWord(String[] arr, String str) {
		int count = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index].equals(str))
				count++;
		}
		return count;
	}
	void displayMaxRepeatingWordWithCount(String input) {
		String[] arr = input.split(" ");
		int count = 0;
		String repeatingWord = null;
		for(int index = 0; index < arr.length; index++) {
			if(getCountOfEachWord(arr, arr[index]) > count) {
				count = getCountOfEachWord(arr, arr[index]);
				repeatingWord = arr[index];
			}
		}
		System.out.println(repeatingWord + " -> "+ count);		
	}
	public static void main(String[] args) {
		RepeatingWordAndCount repeatingWordAndCount = new RepeatingWordAndCount();
		String input = "Hi Hello Hi Techno Hello Hi";
		repeatingWordAndCount.displayMaxRepeatingWordWithCount(input);
	}
}
