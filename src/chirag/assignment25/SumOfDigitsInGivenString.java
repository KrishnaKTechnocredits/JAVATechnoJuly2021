package chirag.assignment25;

public class SumOfDigitsInGivenString {
	
	void sumDigitInaGivenString(String input) {
		int sum=0;
		String str="";
		int convert;
		for(int index=0;index < input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				str=str + ch;
			}
			else if (!str.equals("")) {
				convert = Integer.parseInt(str);
				sum=sum + convert;
				str = "";
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitsInGivenString sumOfDigitsInGivenString = new SumOfDigitsInGivenString();
		String str = "te12ch33no3credit4s";
		sumOfDigitsInGivenString.sumDigitInaGivenString(str);
		
	}

}
