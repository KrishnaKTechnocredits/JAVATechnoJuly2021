package vivek.Assignment29;

public class Assignment29_1 {

	boolean isPalendrome(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		if (output.equals(str))
			return true;
		else
			return false;
	}

	void displayResult(String str) {
		if (isPalendrome(str) == true)
			System.out.println(str + " is a palendrome");
		else
			System.out.println(str + " is not a palendrome");
	}

	public static void main(String[] args) {
		Assignment29_1 assignment29_1 = new Assignment29_1();
		String str = "naman";
		assignment29_1.displayResult(str);
	}
}
