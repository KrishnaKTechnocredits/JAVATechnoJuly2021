package varun.varun_string_assignment;

public class MinimumWordLength {
	String getMinWord(String input){
		String minWord = " ";
		String[]arr = input.split(minWord);
		int min = arr[0].length();
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()<min) {
				min = arr[index].length();
				minWord = arr[index];
			}
		}
		return minWord;
	}
	public static void main(String[] args) {
		MinimumWordLength assignment19_3 = new MinimumWordLength();
		String input = "good morning technocredits hi hello";
		System.out.println(assignment19_3.getMinWord(input));
	}
}
