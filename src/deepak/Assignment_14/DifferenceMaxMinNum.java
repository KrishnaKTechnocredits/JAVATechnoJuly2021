//Assignment 14 [Program 3]-[Difference between max and min number from given array] DATE: 08/15
package deepak.Assignment_14;

public class DifferenceMaxMinNum {
	
	int getMaxNumber(int[] array) {
		int maxNum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>maxNum) {
				maxNum=array[i];
			}
		}return maxNum;
	}
	
	int getMinNumber(int[] array) {
		int minNum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<minNum) {
				minNum=array[i];
			}
		}return minNum;
	}
	
	int differnceMaxMinNum(int[] array) {
		int difference=getMaxNumber(array)-getMinNumber(array);
		return difference;
	}
	
	public static void main(String[] args) {
		DifferenceMaxMinNum obj=new DifferenceMaxMinNum();
		int[] array={1,11,44,23,55,99,23};
		System.out.println("Difference of Maximum number and minimum number is: "+obj.differnceMaxMinNum(array));
	}

}
