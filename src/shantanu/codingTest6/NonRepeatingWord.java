package shantanu.codingTest6;

public class NonRepeatingWord {
	String getNonRepeatingWord(String str) {
		String outputStr="";
		String[] arrStr = str.split(" ");
		for(int index = 0; index < arrStr.length; index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex < arrStr.length; innerIndex++) {
				if(arrStr[index].equals(arrStr[innerIndex]))
					count++;
			}
			if(count == 1) {
				outputStr = arrStr[index];
				break;
			}
		}
		return outputStr;
	}
	void displayNonRepeatingWord(String str) {
		System.out.println("Non repeating word is: "+getNonRepeatingWord(str));
	}
	public static void main(String[] args) {
		NonRepeatingWord nonRepeatingWord = new NonRepeatingWord();
		String str = "hi this is techno gm credits this hi is";
		nonRepeatingWord.displayNonRepeatingWord(str);
	}
}
