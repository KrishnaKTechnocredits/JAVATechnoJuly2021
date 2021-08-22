package husain;

public class Assignment_19_Program2 {

	String findMaxWordLength(String str) {
		int max = 0;
		String newStr = "";
		String arr[] = str.split(" ");

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > max) {
				max = arr[index].length();
				newStr = arr[index];
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_Program2 obj = new Assignment_19_Program2();
		String str = "good morning technocredits hi hello";
		String maxLength = obj.findMaxWordLength(str);
		System.out.println("The longest word in the given string \'" + str + "\' is '" + maxLength
				+ "\' and the max length is: " + maxLength.length());

	}

}
