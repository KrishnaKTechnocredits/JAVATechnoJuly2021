//Assignment 14 [Program 4]-[Get difference between max odd number and max even number] DATE: 08/15
package deepak.Assignment_14;

public class DifferenceMaxOddMaxMin {

	int getEvenNumberMax(int[] array) {
		int maxEvenNum=array[0];
		for( int i=0 ; i < array.length ; i++) {
			if(array[i] % 2 == 0 && array[i] > maxEvenNum) {
				maxEvenNum=array[i];
				}
			}//System.out.println(maxEvenNum);
			return maxEvenNum;
	}
		
	int getOddNumberMax(int[] array) {
		int maxOddNum=array[0];
		for( int i=0 ; i < array.length ; i++) {
			if(array[i] % 2 != 0 && array[i]>=maxOddNum) {
				maxOddNum=array[i];
				}
			}//System.out.println(maxOddNum);
		return maxOddNum;
	}
	
	int differenceMaxOddEven(int[] array) {
		int diff=getOddNumberMax(array)-getEvenNumberMax(array);
		return diff;
	}
	
	public static void main(String[] args) {
	
		DifferenceMaxOddMaxMin obj=new DifferenceMaxOddMaxMin();
		int[] array = {1,11,44,23,55,99,23,22};
		System.out.print("Difference between the sum of Maximum Odd Number and Maximum Even Number is: "+obj.differenceMaxOddEven(array));
	}

}
