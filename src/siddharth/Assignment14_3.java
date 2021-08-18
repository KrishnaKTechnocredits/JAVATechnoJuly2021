package siddharth;

public class Assignment14_3 {
	int max;
	int min;
	int difference;
	void maxNumber(int input[]) {
		int max = input[0];
		for(int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
			}
		}
		System.out.println("Maximum number is" + max);
	}


	void minNumber(int input[]) {
	int min = input[0];
	for (int index = 0; index < input.length; index++) {
		if (min > input[index]) {
			min = input[index];
		}
	}
	System.out.println("Minimum number is" + min);
}

void difference() {
	difference = max-min;
	System.out.println("Difference between Max & min is: " + 
	difference);
}


public static void main(String[] args) {
	int[] input = { 1,23,55,97,23 };
	Assignment14_3 assignment14_3 = new Assignment14_3();
	assignment14_3.maxNumber(input);
	assignment14_3.minNumber(input);
	assignment14_3.difference();
  }
}