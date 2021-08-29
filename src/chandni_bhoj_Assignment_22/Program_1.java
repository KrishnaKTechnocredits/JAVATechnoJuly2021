package chandni_bhoj_Assignment_22;

public class Program_1 {
	
	int getTotalDigits (String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		new Program_1().getTotalDigits("Te1ch2no3cr4ed3it4s");
		System.out.println (new Program_1().getTotalDigits("Te1ch2no3cr4ed3it4s"));
	}

}
