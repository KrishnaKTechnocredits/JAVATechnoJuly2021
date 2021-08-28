package chandani;

public class ScodingTest1{
	
	 int getSumOfDigitsFromString(String arr){
		
		int sum = 0;
		for(int index = 0; index < arr.length(); index++){
			boolean value = Character.isDigit(arr.charAt(index));
			if(value == true) {
				System.out.println(arr.charAt(index));
				sum += Character.getNumericValue(arr.charAt(index));
			}
		};
		return sum;
	}
	 
	 int getSumOfDigitsFromStringArray(String[] input)
		{
			int sum=0;
			System.out.println("Digits in the given string array are : ");
			for(int index =0;index<input.length;index++)
			{
				sum+=getSumOfDigitsFromString(input[index]);
			}
			return sum;
		}
	
	 
	public static void main(String[] args){
		ScodingTest1 scodingTest1 = new ScodingTest1();
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum of given string array is : " + scodingTest1.getSumOfDigitsFromStringArray(input));
	}
}

