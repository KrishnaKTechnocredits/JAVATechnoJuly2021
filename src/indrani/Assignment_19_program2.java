package indrani;

public class Assignment_19_program2{
	
	String findMaxWordLength(String str){
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
		
		Assignment_19_program2 program2 = new Assignment_19_program2();
		String str = "good morning technocredits hi hello";
		String maxLength = program2.findMaxWordLength(str);
		System.out.println("The longest word in the given string \'" + str + "\' is '" + maxLength
				+ "\' and the length of the longest word is: " + maxLength.length());

	}

}
