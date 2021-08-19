package monika;

public class Assignment14_Program_2 {
	int getMinimumNumberFromArray(int[] number ) {
		int min=number[0];
		for(int index=0;index<number.length;index++) {
			if(number[index]<min)
				min=number[index];
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment14_Program_2 assignment14_Program_2= new Assignment14_Program_2();
		System.out.println("Minimum number from given array is "+assignment14_Program_2.getMinimumNumberFromArray(input));
	}
}
