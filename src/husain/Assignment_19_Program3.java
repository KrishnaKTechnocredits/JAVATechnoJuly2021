package husain;

public class Assignment_19_Program3 {

	String findMinWordLength(String str) {
		String newStr = "";
		String arr[] = str.split(" ");
		int temp = arr[0].length();

		for (int index = 1; index < arr.length; index++) {
			if (arr[index].length() < temp) {
				temp = arr[index].length();
				newStr = arr[index];
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_Program3 obj = new Assignment_19_Program3();
		String str = "good morning technocredits hi hello";
		String minLength = obj.findMinWordLength(str);
		System.out.println("The smallest word in the given string \'" + str + "\' is '" + minLength
				+ "\' and the max length is: " + minLength.length());

	}

}
