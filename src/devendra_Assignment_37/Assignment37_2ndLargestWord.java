package devendra_Assignment_37;
/*
WAP to find a second largest word.
Input: Welcome to the family
Output: family
*/
public class Assignment37_2ndLargestWord {
	String getSecondLargestWord(String input) {
		String secLargestWord = "";
		String word = "";
		int temp = 0;
		String arr[] = input.split(" ");
		for(int index = 0; index < arr.length; index++) {
			if(word.length() < arr[index].length()) {
				word = arr[index];
				temp = index;
			}
		}
		arr[temp] = "";
		for(int index = 0; index < arr.length; index++) {
			if(secLargestWord.length() < arr[index].length()) {
				secLargestWord = arr[index];
			}
		}
		return secLargestWord;
	}
	
	public static void main(String[] args) {
		Assignment37_2ndLargestWord obj = new Assignment37_2ndLargestWord();
		String str = "Welcome to the Family";
		System.out.println("Input String : " +str);
		System.out.println("Second Largest Word : " +obj.getSecondLargestWord(str));
	}
}