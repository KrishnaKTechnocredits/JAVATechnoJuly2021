package chandni_bhoj_Assignment_22;

public class Program_2 {
	
	int getSumOfAllDigits (String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		new Program_2().getSumOfAllDigits("Te11ch2no3cr4edi2ts");
		System.out.println (new Program_2().getSumOfAllDigits("Te11ch2no3cr4edi2ts"));
	}

}
