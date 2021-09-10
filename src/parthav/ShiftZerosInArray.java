//Test 4 : Shift all Zero's at the end of the array. 
//int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
//output : {1,6,2,3,4,5,0,0,0,0,0};

package parthav;

public class ShiftZerosInArray {

	int[] getArrayWithZerosShifted(int[] inputArr) {
		int[] returnedArr = new int[inputArr.length];
		int returnedArrIndex = 0;
		for (int index = 0; index < inputArr.length; index++) {

			if (inputArr[index] != 0) {
				returnedArr[returnedArrIndex] = inputArr[index];
				returnedArrIndex++;
			} 

		}

		return returnedArr;
	}

	public static void main(String[] args) {
		ShiftZerosInArray newObject = new ShiftZerosInArray();
		int[] inputArr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		int[] returedArr = newObject.getArrayWithZerosShifted(inputArr);
		System.out.print("{");
		for (int index = 0; index < returedArr.length; index++) {
			System.out.print(returedArr[index] + ",");
		}
		System.out.print("}");
	}

}
