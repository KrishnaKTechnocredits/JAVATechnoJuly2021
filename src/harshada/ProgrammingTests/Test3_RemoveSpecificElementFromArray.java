package harshada.ProgrammingTests;

import java.util.Arrays;

public class Test3_RemoveSpecificElementFromArray {
	
	void removeElementFromArray(int array[], int numToDelete) {
		System.out.println("Array before removing Elements : "+ Arrays.toString(array));
		int output[]=new int[(array.length)-1] ;
		int tempIndex=0;
		for(int index=0; index < (array.length); index ++) {
			if(array[index] != numToDelete) {
					output[tempIndex]=array[index];
					tempIndex++;
				}
		}
		System.out.println("After removing number " + numToDelete + " from Array,  Elements Are :" + Arrays.toString(output));	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_RemoveSpecificElementFromArray test3RemoveArrayEle=new Test3_RemoveSpecificElementFromArray();
		int array[]= {1,2,3,4,5};
		int numToDelete=2;
		test3RemoveArrayEle.removeElementFromArray(array, numToDelete);
	}

}
