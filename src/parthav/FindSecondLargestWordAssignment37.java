package parthav;

public class FindSecondLargestWordAssignment37 {

	int maxLength;
	int largestIndex;
	String largestWord;
	int secondLargestIndex;

	void findLargestWord(String[] arr) {
		maxLength = 0;
		largestIndex = 0;

		for (int index = 0; index < arr.length; index++) {
			if (maxLength < arr[index].length()) {
				maxLength = arr[index].length();
				largestIndex = index;
			}
		}

	}

	void printNthLargestWord(String str, int n) {
		String strArray[] = str.split(" ");

		for (int index = 0; index < n; index++) {
			findLargestWord(strArray);
			largestWord = strArray[largestIndex];
			strArray[largestIndex] = "";
		}

		System.out.println("The " + n + "th largest word in the passed string is: " + largestWord);
	}

	public static void main(String[] args) {
		FindSecondLargestWordAssignment37 newObject = new FindSecondLargestWordAssignment37();
		String str = "Welcome to the family";
		newObject.printNthLargestWord(str, 2);
		FindSecondLargestWordAssignment37 newObject1 = new FindSecondLargestWordAssignment37();
		str = "Can we see please";
		newObject1.printNthLargestWord(str, 2);

	}

}
