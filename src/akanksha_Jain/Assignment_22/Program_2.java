package akanksha_Jain.Assignment_22;

public class Program_2 {
	static int count=0;
	static int sum=0;

	int getSumOfDigitsFromString(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				int number = Character.getNumericValue(ch);
				sum = sum + number;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "Te11ch2no3cr4edi2ts";
		int answer = new Program_2().getSumOfDigitsFromString(str);
		System.out.println("The sum of digits in a string is " + answer);
	}
}
