package akshay;

public class DiffMaxAndMin {
	
	int getMaxNumber(int[] num) {
		int maxNumber = 0;
		for(int index = 0; index < num.length; index++) {
			if(num[index] > maxNumber)
				maxNumber = num[index];
		}
		return maxNumber;
	}
	
	int getMinNumber(int[] num) {
		int minNumber = num[0];
		for(int index = 0; index < num.length; index++) {
			if (num[index] < minNumber) {
				minNumber = num[index];
			}
		}
		
		return minNumber;
	}
	
	public static void main(String[] args) {
		DiffMaxAndMin diffmaxandmin = new DiffMaxAndMin();
		int[] input = {11,44,1,23,55,99,23};
		int difference = diffmaxandmin.getMaxNumber(input)-diffmaxandmin.getMinNumber(input);
		System.out.println("Difference between MaxNumber and MinNumber: " + difference);
	}
}
