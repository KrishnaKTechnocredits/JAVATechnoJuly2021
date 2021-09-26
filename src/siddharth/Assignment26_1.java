package siddharth;

public class Assignment26_1 {
	String getReverseOfString(String str) {
		String outputString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			outputString += str.charAt(index);
		}
		return outputString;
	}

	public static void main(String[] args) {
		Assignment26_1 assignment26_1 = new Assignment26_1();
		String str = "The Best is  Technocredits";
		System.out.println(assignment26_1.getReverseOfString(str));
	}
}
