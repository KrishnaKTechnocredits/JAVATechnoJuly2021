/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/

package shraddha.Assignment31;

import java.util.Arrays;

public class ConsecutiveTripletsInArray {
	public static void main(String[] args) {
		int[] inputArray = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		ConsecutiveTripletsInArray newObject = new ConsecutiveTripletsInArray();
		newObject.getConsecutiveTripletsInArray(inputArray);
	}

	void getConsecutiveTripletsInArray(int[] inputArray) {
		int number1;
		int number2;
		int number3;
		int count = 0;
		System.out.println("input array is :- " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length - 2; index++) {
			number1 = inputArray[index];
			number2 = inputArray[index + 1];
			number3 = inputArray[index + 2];
			if (number2 - number1 == 1 && number3 - number2 == 1) {
				count++;
				System.out.println(number1 + " " + number2 + " " + number3);
			}
		}
		if (count != 0)
			System.out.println("there are " + count + " consecutive triplets in above array");
		else
			System.out.println("there are no consecutive triplets in above array");
	}
}
