package varun.varun_string_assignment;

public class SumOfAllNumFromGivenString {
	void sumOfNumbers(String str) {
		int sum=0;
		String inputStr ="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				inputStr += str.charAt(index);
			}
			else {
				if(!inputStr.equals("")) {
					sum += Integer.parseInt(inputStr);
					inputStr="";
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOfAllNumFromGivenString sumOfAllNumFromGivenString = new SumOfAllNumFromGivenString();
		String input = "te12ch33no3credit4s";
		sumOfAllNumFromGivenString.sumOfNumbers(input);
	}
}
