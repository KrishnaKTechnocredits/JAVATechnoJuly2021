/* Assignment 14 : 15th Aug'2021
program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/

package akanksha_Jain.Assignment_14;

public class Assignment_14_Program_4 {
	static int maxEven=0, maxOdd=0, diff;
	
	void findMaxEvenOddNumber(int[] input) {
		for(int index = 0;index<input.length;index++){
			if(input[index]%2==0)
				if (input[index]>maxEven)
						maxEven = input[index];
			if(input[index]%2!=0)
				if (input[index]>maxOdd) 
					maxOdd = input[index];
		}
		System.out.println("The maximum odd number in array is: " + maxOdd);
		System.out.println("The maximum even number in array is: " + maxEven);
	}
	
	static int diff(int maxEven, int maxOdd) {
		if (maxOdd>maxEven)
			diff= maxOdd - maxEven;
		else
			diff = maxEven - maxOdd;
		return diff;
	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_Program_4 program_4 = new Assignment_14_Program_4();
		program_4.findMaxEvenOddNumber(input);
		Assignment_14_Program_4.diff(maxEven, maxOdd);
		System.out.println("The difference between maximum odd number and maximun even number from given array is " + diff);
	}
}
