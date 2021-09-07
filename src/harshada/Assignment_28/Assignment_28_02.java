/* Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/
package harshada.Assignment_28;

import java.util.Arrays;


public class Assignment_28_02 {
	
	int getMaxNumber(int inputArray[])
	{
		
		int max=0;
		int secondMax=0;
		int maxIndex=0;
		
		for(int index=0; index < inputArray.length; index++) {
			if(inputArray[index] > max) {
			secondMax=max;
			max=inputArray[index];
			maxIndex=index;
			}
		}
		inputArray[maxIndex] = 0;
		
		//System.out.println("Maximum Number is = " + max);
		
		return max;
		
	}
	
	int getNthHighestNumber(int array[], int n) {
		
		int nMax=0;
		while(n>0) {
			nMax=getMaxNumber(array);
			n--;
		}
		return nMax;
		//System.out.println(n+" highest number in Array is= "+nMax); n=0 is printing so dont print here 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_28_02 assignment28_2 = new Assignment_28_02();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		int nPosition=3;
		System.out.println("Given Array is : "+ Arrays.toString(arr));
		int NthMaxNumber = assignment28_2.getNthHighestNumber(arr, nPosition);
		System.out.println("The " + + nPosition +" rd highest number in above Array is = "+NthMaxNumber);
	}

}
