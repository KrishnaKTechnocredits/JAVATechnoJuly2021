package chandni_bhoj_ScodingTest_1;

public class Program_1 {
	
	int getSumOfAllDigitsInString (String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
			sum += Character.getNumericValue(ch);
		}
		
		
		return sum;
	}
	
	String [] getStringArray (String input) {
			String [] input1 = input.split(",");
			return input1;
			
	}
	
	int getSumOfAllDigitsInStringArray (String [] input1) {
		int total = 0;
		for (int index = 0; index < input1.length; index++) {
			total += getSumOfAllDigitsInString(input1[index]);
		}
		
		return (total);
	}
	
	public static void main(String[] args) {
		Program_1 program_1 = new Program_1 ();
		String [] input =  program_1.getStringArray("“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”");
		program_1.getSumOfAllDigitsInStringArray(input);
		System.out.println (program_1.getSumOfAllDigitsInStringArray(input));
	
	}
}
