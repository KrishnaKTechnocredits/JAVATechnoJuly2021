package ramkrishna;

public class MaxMinNumber {

	
	int max=0;
	int getMaxNumber(int[] input) {

		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	 int getMinNumber(int[] number) {
		int min = number[0];
        for (int index = 0; index < number.length; index++) {
			if (number[index] < min)
				min = number[index];
		}
		return min;
	}
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinNumber maxminnumber = new MaxMinNumber();
		
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Max Number is : " + maxminnumber.getMaxNumber(input));

		//int[] number = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Min Number is :" + maxminnumber.getMinNumber(input));
		
	}

}
