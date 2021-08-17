//Assignment 14 [Program 1]-[Get Maximum in the Array] DATE: 08/15
package deepak.Assignment_14;

public class MaxNumberInArray {
		
	int getMaxNum(int array[]) {
		int maxNum=array[0];
		for(int i = 0 ;i < array.length ; i++) {
			if(array[i] > maxNum)
				maxNum = array[i];
		}
		return maxNum;
	}	
		
	public static void main(String[] args) {
		MaxNumberInArray maxNumber=new MaxNumberInArray();
		int[] array= {1,11,44,23,55,99,23};
		System.out.println("Maximum number in the given array is: "+maxNumber.getMaxNum(array));		
	}
}