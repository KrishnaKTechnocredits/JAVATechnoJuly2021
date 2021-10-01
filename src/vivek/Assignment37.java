/*WAP to find a second largest word  
Example:
Input: Welcome to the family
Output: family*/

package vivek;

public class Assignment37 {

	static void getSecondWord(String str) {
		String[] arr = str.split(" ");
		String FirstMaxWord = arr[0];
		String SecondMaxWord = arr[1];
		for (int index = 0; index < arr.length; index++) {
			if (FirstMaxWord.length() < arr[index].length()) {
				SecondMaxWord = FirstMaxWord;
				FirstMaxWord = arr[index];
			} else if (FirstMaxWord.length() > arr[index].length() && SecondMaxWord.length() < arr[index].length())
				SecondMaxWord = arr[index];
		}
		System.out.println(SecondMaxWord);
	}

	public static void main(String[] args) {
		String str = "Welcome to the family";
		Assignment37.getSecondWord(str);
	}
}
