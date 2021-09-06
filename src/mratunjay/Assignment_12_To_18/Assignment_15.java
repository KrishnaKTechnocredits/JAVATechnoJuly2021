package mratunjay.Assignment_12_To_18;

public class Assignment_15 {	
	
	int getDifferenceEvenOddLength(String[] num) {
		int sumEven=0;
		int sumOdd=0;
		for (int index=0;index<num.length;index++) {
			if(num[index].length()%2==0)
				sumEven+=num[index].length();
			else
				sumOdd+=num[index].length();
		}
		return sumEven-sumOdd;
	}
	
	void getMidCharOfStringArr(String[] input) {
		int midIndex = 0;
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				midIndex = input[index].length() / 2 - 1;
			} else {
				midIndex = input[index].length() / 2;
			}
			output[index] = input[index].charAt(midIndex);
			System.out.println("Middle Character of string '" + input[index] + "' is " + output[index]);
		}

	}
	
	int getDifferenceSumEvenSumOdd(int[] input) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sumEven += input[index];
			else
				sumOdd += input[index];
		}
		if (sumEven > sumOdd)
			return sumEven - sumOdd;
		else
			return sumOdd - sumEven;
	}
	
	
	public static void main(String[] args) {
		 String[] input = {"Maulik","Techno","Nidhi","Ankit"};
		Assignment_15 A_15 = new Assignment_15();
		System.out.println("Difference of even length name and odd length name is "+A_15.getDifferenceEvenOddLength(input));
		
		String[] input1 = { "hello", "techno", "credits" };
		A_15.getMidCharOfStringArr(input1);
		
		int[] input2 = { 12, 2, 13, 9 };		
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ A_15.getDifferenceSumEvenSumOdd(input2));
		
		
		
	}

}
