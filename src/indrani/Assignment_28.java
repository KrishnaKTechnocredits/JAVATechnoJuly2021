/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/

package indrani;

public class Assignment_28 {
	
	int getSecondHighestNumber(int[] array) {
		int highest = array[0],secondHighest = array[0];
		int temp = 0;
		for(int index=1; index<array.length; index++) {
			if(highest < array[index]) {
				highest = array[index];
				temp = index;
			}
		}
		array[temp]=0;
		for(int index=1; index<array.length; index++) {
			if(secondHighest<array[index])
				secondHighest=array[index];
		}
		return secondHighest;
	}
	public static void main(String[] args) {
		Assignment_28 program1 = new Assignment_28();
		int[] input = {10,23,2,11,55,43,99};
		System.out.println("Second highest number: " + program1.getSecondHighestNumber(input));
	}
}