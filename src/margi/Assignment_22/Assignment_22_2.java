package margi.Assignment_22;

public class Assignment_22_2 {
	
	int getSumDigits(String input) {
		int sum = 0;
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment_22_2 digitSum = new Assignment_22_2();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of digits: " + digitSum.getSumDigits(str));
	}
}
