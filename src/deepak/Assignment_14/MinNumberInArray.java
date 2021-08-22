//Assignment 14 [Program 2]-[Get Minimum in the Array] DATE: 08/15
package deepak.Assignment_14;

public class MinNumberInArray {
		
	int getMinNum(int array[]) {
		int minNum=array[0];
		for(int i = 0 ;i < array.length ; i++) {
			if(array[i] < minNum)
				minNum = array[i];
		}
		return minNum;
	}	
		
	public static void main(String[] args) {
		MinNumberInArray minNumber=new MinNumberInArray();
		int[] array= {1,11,44,23,55,99,23};
		System.out.println("Minimum number in the given array is: "+minNumber.getMinNum(array));		
	}
}