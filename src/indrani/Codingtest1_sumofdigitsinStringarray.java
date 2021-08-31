package indrani;

public class Codingtest1_sumofdigitsinStringarray {
	int sumOfDigits(String input) {
		int sumOfDigits=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
					sumOfDigits+=Character.getNumericValue(ch);
		}
		return sumOfDigits;
	}
	int totalSumInArray(String[] input) {
		int finalsum=0;
		for(int index=0;index<input.length;index++) {
		finalsum+=sumOfDigits(input[index]);
		}
		return finalsum;
	}
	public static void main(String[] args) {
		String[] input={"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		Codingtest1_sumofdigitsinStringarray test1=new Codingtest1_sumofdigitsinStringarray();
		System.out.println("The total sum is "+test1.totalSumInArray(input));
	}
	
}
