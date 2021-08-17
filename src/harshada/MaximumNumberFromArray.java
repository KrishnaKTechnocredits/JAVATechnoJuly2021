/*Assignment 14 : 15th Aug'2021


program 1 : find maximum number from given array.

int[] input = {1,11,44,23,55,99,23};
output : 99
*/

package harshada;

public class MaximumNumberFromArray {

	int getMaximumNumFromArray() {
	int[] input = {1,11,44,23,55,99,23};
	int max=input[0];
	for(int index=1; index < input.length; index++) {
		if(input[index]> max)
			max=input[index];
	}
	return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumNumberFromArray maximumNumberFromArray=new MaximumNumberFromArray();
		int tempMax=maximumNumberFromArray.getMaximumNumFromArray();
		System.out.println("Maximum Number of given Array is= " + tempMax);
	}

}
