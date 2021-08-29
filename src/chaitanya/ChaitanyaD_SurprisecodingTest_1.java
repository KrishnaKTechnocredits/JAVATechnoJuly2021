package chaitanya;
import java.util.Arrays;

public class ChaitanyaD_SurprisecodingTest_1 {
	
	int printSumofNumbersinArray(String[] input) {
		int sum = 0;
		for (int i = 0; i<input.length; i++) {
			String str = input[i];
			   for(int index=0 ; index<str.length(); index++) {
				   char ch = str.charAt(index);
				   		if (Character.isDigit(ch)) {
				   			int tempsum = Character.getNumericValue(ch);
				   				sum += tempsum;
				   		}
			   }
		}
		
		return sum ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChaitanyaD_SurprisecodingTest_1 chaitanyad_surprisecodingtest_1 = new ChaitanyaD_SurprisecodingTest_1();
		String input[] = {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.print("Given Array : "+Arrays.toString(input));
		System.out.println("\nSum of All the digits available in the Array : " + chaitanyad_surprisecodingtest_1.printSumofNumbersinArray(input));
 	}

}
