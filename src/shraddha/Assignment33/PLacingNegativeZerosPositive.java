/*Assignment - 33 : 11th Sep'2021
program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
*/
package shraddha.Assignment33;

import java.util.Arrays;

public class PLacingNegativeZerosPositive {
	public static void main(String[] args) {
		
int[] inputArray = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
int[] outputArray = new int[inputArray.length];
int temp = 0;
System.out.println("Input Array is:-"+Arrays.toString(inputArray));
for (int index = 0; index < inputArray.length; index++) {
	if (inputArray[index] < 0)
		outputArray[temp++] = inputArray[index];
}
for (int index = 0; index < inputArray.length; index++) {
	if (inputArray[index] == 0)
		outputArray[temp++] = inputArray[index];
}
for (int index = 0; index < inputArray.length; index++) {
	if (inputArray[index] > 0)
		outputArray[temp++] = inputArray[index];
}
System.out.println("Output Array is :- " + Arrays.toString(outputArray));
}
}
