package genius;

public class Sumofalldigitinstringarray {
	
	int sumOfAllDigitInStringArray(String arr) {
		int sum=0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				sum = sum + Character.getNumericValue(arr.charAt(index));
				
			
		}
		return sum;
	}
	
	int getSumOfEachStringFromArray(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum+=sumOfAllDigitInStringArray(input[index]);
		}
		return sum;
	}
	public static void main(String[] args) {
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		Sumofalldigitinstringarray sumofalldigitinstringarray = new Sumofalldigitinstringarray();
		int ans = sumofalldigitinstringarray.getSumOfEachStringFromArray(input);
		System.out.println("Sum of all digit in given string array is "+ans);
	}

}
