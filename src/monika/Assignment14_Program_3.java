package monika;

public class Assignment14_Program_3 {
	int getMaximumMinimumNumberDifferenceFromArray(int[] number ) {
		int min=number[0];
		int max=0;
		for(int index=0;index<number.length;index++) {
			if(number[index]<min)
				min=number[index];
			if (number[index] > max)
				max = number[index];
		}
		return max-min;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment14_Program_3 assignment14_Program_3= new Assignment14_Program_3();
		System.out.println("Difference Between Maximum And Minimum number from given array is "+assignment14_Program_3.getMaximumMinimumNumberDifferenceFromArray(input));
	}
}
