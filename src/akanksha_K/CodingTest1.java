package akanksha_K;

public class CodingTest1 {
	
	int getsumOfDigit(String input) {
		int sum = 0;
		char ch ;
		for (int index=0; index<input.length();index++) {
			ch =  input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum+ Character.getNumericValue(ch);
			}
	    }
		return sum;
	}
	
	int getStringsum(String[] input) {	
		int sum = 0;
		for (int index=0; index<input.length; index++) {
			sum = sum + getsumOfDigit(input[index]);
		}
		return sum;
	}
	
	public static void main(String args[]) {
	CodingTest1 test = new CodingTest1(); 
	String[] input = {"t2e4c","2h7no","3h6h2h5","1mk3", "k9g8"};
	System.out.println("The sum of digits in given string: " +test.getStringsum(input));
	
	}	
}
