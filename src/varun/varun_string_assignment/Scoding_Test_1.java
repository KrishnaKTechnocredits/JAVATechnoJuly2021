package varun.varun_string_assignment;

public class Scoding_Test_1 {
	int getSumOfAllNum(String arr) {
		int sum = 0;
		for(int index =0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				sum +=Character.getNumericValue(arr.charAt(index));
		}
		return sum;
	}
	
	int getSumOfEachStringFromArray(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum+=getSumOfAllNum(input[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scoding_Test_1 scoding_Test_1 = new Scoding_Test_1();
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		//scoding_Test_1.getSumOfEachStringFromArray(input);
		System.out.println("Sum of numbers from the given string array is " +scoding_Test_1.getSumOfEachStringFromArray(input));
		
	}
}
