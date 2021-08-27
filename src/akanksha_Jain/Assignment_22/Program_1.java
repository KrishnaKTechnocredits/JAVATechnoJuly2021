package akanksha_Jain.Assignment_22;

public class Program_1 {
	static int count=0;

	int getDigitsFromString(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		int answer = new Program_1().getDigitsFromString(str);
		System.out.println("The number of digits in a string is " + answer);
	}
}
