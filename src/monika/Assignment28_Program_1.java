/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/

package monika;

public class Assignment28_Program_1 {

	void getSecondHighestNumber(int[] array) {
		int firstMax=0;
		int secondMax=0;
		
		if(array[0]> array[1]) {
			firstMax=array[0];
			secondMax=array[1];
		}
		else {
			firstMax=array[1];
			secondMax=array[0];
		}
		for(int index=2; index<array.length;index++) {
			
			if(array[index]>firstMax) {
				secondMax=firstMax;
				firstMax=array[index];
			}
			else if(array[index] != firstMax && array[index] > secondMax){
				secondMax=array[index];
			}
		}
		System.out.println(secondMax);
	}
	public static void main(String[] args) {
		Assignment28_Program_1 assignment28_Program_1=new Assignment28_Program_1();
		int[] arr = {10,23,2,11,55,43,99};
		assignment28_Program_1.getSecondHighestNumber(arr);
	}
}
