package ramkrishna;

public class CalculateSumDigit {
	
	
	int calDigit(String str) {
		int sum=0;
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
			  sum= sum+Character.getNumericValue(str.charAt(index));
			}
		}
		 return sum;
	}
	
	int sumOfDigit(String[] str) {
		
		int sum=0;
		for (int index=0;index<str.length; index++) {
			sum=sum+ calDigit(str[index]);
			
		} return sum;
	}

	
	public static void main(String[] arg) {
		CalculateSumDigit calculatesumdigit = new CalculateSumDigit();
		String[] str = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(calculatesumdigit.sumOfDigit(str));
		
	  }
	
}
