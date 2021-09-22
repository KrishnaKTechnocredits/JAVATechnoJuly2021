/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/

package parthav.parthavD_Assignment33;

public class ShiftNonZerosAtEnd {
	
	int ZeroNums = 0;
	
	void shiftNonZerosAtEnd (int[] inputArr){
		int[] newShiftedArray = new int[inputArr.length];
		for (int index = 0;index < inputArr.length;index++){
			if (inputArr[index] == 0)
				ZeroNums++;
		}
		
		for (int index = 0;index < inputArr.length;index++){
			if (inputArr[index] != 0){
				newShiftedArray[ZeroNums] = inputArr[index];
				ZeroNums++;
			}
		}
		
		System.out.print("The new shifted array is: { " );
		for (int index = 0;index < newShiftedArray.length;index++){
			System.out.print(newShiftedArray[index] + ","); 
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		System.out.println("-------------Program1-----------------------");
		ShiftNonZerosAtEnd newObject1 = new ShiftNonZerosAtEnd();
		int[] inputArr1 = {1,0,3,4,0,2,88,0,0,22,34};
		newObject1.shiftNonZerosAtEnd(inputArr1);
		
		System.out.println("-------------Program2-----------------------");				
		PlaceNegativePositiveNumbers newObject = new PlaceNegativePositiveNumbers();
		int[] inputArr2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		newObject.printShiftedArray(inputArr2);
		
		System.out.println("-------------Program3-----------------------");
		PlaceNegativePositiveZeroNumbers newObject2 = new PlaceNegativePositiveZeroNumbers();
		int[] inputArr3 = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		newObject2.printShiftedArray(inputArr3);

	}

}
