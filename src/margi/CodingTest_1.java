package margi;
public class CodingTest_1 {

	int getSum(String[] input) {
		int sum=0;
		for(int index=0; index<input.length; index++) {
			sum += processData(input[index]);
		}
		return sum;
	}
	int processData(String str) {
		char ch = ' ';
		int sum=0;
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		return sum;	
	}
	public static void main(String[] args) {
		CodingTest_1 codingTest_1 = new CodingTest_1();
		String input[]= {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.println("Sum is: " + codingTest_1.getSum(input));
	}
}
