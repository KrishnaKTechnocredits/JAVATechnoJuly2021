package dattaraj;

public class Assignment_19_P1 {
	int countWordsInString(String inputStr) {
		String[] splitString = inputStr.split(" ");
		return splitString.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_P1 assign19_p1 = new Assignment_19_P1();
		String inputStr = "Hi Techno Credits Hello";
		System.out.println("Word count in given string :"+assign19_p1.countWordsInString(inputStr));
	}

}
