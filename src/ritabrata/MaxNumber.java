/*Assignment 14 : 15th Aug'2021
program 1 : find maximum number from given array.

int[] input = {1,11,44,23,55,99,23};
output : 99
*/


package ritabrata;

public class MaxNumber {
	int findMAxNumber(int[] input) {
		int number=0;
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input.length;j++) {
				if(input[i]>input[j]) {
					number=input[i];
					i++;
				}
			}
		}
		System.out.println("The maximum among the numbers is: "+number);
		return number;
	}
	
	public static void main(String[] args) {
		MaxNumber max= new MaxNumber();
		int[] arr= {1,11,44,23,55,99,23};
		max.findMAxNumber(arr);
	}
}
