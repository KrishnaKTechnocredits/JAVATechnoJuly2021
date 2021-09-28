package madhavi;

public class Assignment_37 {
	void getSecondHighestWord(String str) {
		String word = "";
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);
		int longest = 0;
		str = str + " ";
		for (int i = 1; i <= 2; i++) {
			for (int k = 0; k < strArr.length; k++) {
				if (strArr[k].length() > longest) {
					longest = strArr[k].length();
					word = strArr[k];
					strArr[k] = " ";

				}
			}
			longest = 0;
		}
		System.out.println("The second longest word is: " + word);
	}

	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		String input = "Welcome to the family is and rtytyrtyrt";
		assignment_37.getSecondHighestWord(input);
	}

}