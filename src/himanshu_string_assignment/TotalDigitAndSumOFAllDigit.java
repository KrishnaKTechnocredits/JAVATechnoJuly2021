package himanshu_string_assignment;

public class TotalDigitAndSumOFAllDigit {
	
	void totalDigit(String input) {
		
		int count = 0;
		int sum = 0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			    count++;
			}
		}
		System.out.println("Total digit of String is : " + count);
		System.out.println("Sum of all digit is : " + sum);
	}
	
	public static void main(String[] args) {
		
		String input = "23himanshu2053";
		TotalDigitAndSumOFAllDigit ex = new TotalDigitAndSumOFAllDigit();
		ex.totalDigit(input);
		
	}

}
