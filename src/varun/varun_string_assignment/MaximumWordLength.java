package varun.varun_string_assignment;

public class MaximumWordLength {
	
	String getMaxWord(String arr) {
		String maxWord = " ";
		int max = 0;
		String []input = arr.split(maxWord);
		for(int index=0;index<input.length;index++) {
			if(input[index].length()>max) {
				max = input[index].length();
				maxWord = input[index];
			}
		}
		return maxWord;
	}
	public static void main(String[] args) {
		MaximumWordLength assignment19_2 = new MaximumWordLength();
		String input = "good morning technocredits hi hello";
		System.out.println(assignment19_2.getMaxWord(input));
	}
}
