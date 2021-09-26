
/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello */
package santosh;
public class Assignment19_Program1 {
	int countWordsInString(String inputStr) {
		String[] splitString = inputStr.split(" ");
		return splitString.length;

	}

	public static void main(String[] args) {
		Assignment19_Program1 assignment19_1 = new Assignment19_Program1();
		String input = "Hi Techno Credits Hello";
		System.out.println("----------------------------------------------------");
		System.out.println("\n Total Count of words in given statement is \n : " + assignment19_1.countWordsInString(input));
	    System.out.println("----------------------------------------------------");
	}
}


