package monika;



public class Assignment14_Program_1 {
	int getMaximumNumberFromArray(int[] number ) {
		int max=0;
		for(int index=0;index<number.length;index++) {
			if(number[index]>max)
				max=number[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment14_Program_1 assignment14_Program_1= new Assignment14_Program_1();
		System.out.println("Maximum number from given array is "+assignment14_Program_1.getMaximumNumberFromArray(input));
	}
}
