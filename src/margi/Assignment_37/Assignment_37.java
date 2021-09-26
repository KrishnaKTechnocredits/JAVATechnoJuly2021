package margi.Assignment_37;

/*WAP to find a second largest word.
Input: Welcome to the family
Output: family*/

public class Assignment_37 {
	
	String getSecondLargestWord(String input) {
		String secLargestWord = "", word = "";
		int temp = 0;
		String arr[] = input.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(word.length()<arr[index].length()) {
				word = arr[index];
				temp = index;
			}
		}
		arr[temp] = "";
		for(int index=0; index<arr.length; index++) {
			if(secLargestWord.length()<arr[index].length()) {
				secLargestWord = arr[index];
			}
		}
		return secLargestWord;
	}
	
	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		String str = "Welcome to the family";
		System.out.println("Input String: " + str);
		System.out.println("Second Largest Word: " + assignment_37.getSecondLargestWord(str));
	}
}
