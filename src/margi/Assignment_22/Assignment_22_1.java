package margi.Assignment_22;

public class Assignment_22_1 {
	int getTotalDigits(String input) {
		int count = 0;
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment_22_1 digits = new Assignment_22_1();
		String str = "Te1ch2no3cr4ed3it4s";
		System.out.println("Total digits: " + digits.getTotalDigits(str));
	}
}
