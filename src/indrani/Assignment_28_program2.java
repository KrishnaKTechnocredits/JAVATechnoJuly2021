
/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package indrani;

public class Assignment_28_program2 {
	int getHighestNumber(int[] array) {
		int highestNumber=0,highestIndex=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>highestNumber) {
				highestNumber=array[i];
				highestIndex=i;
			}
		}
		array[highestIndex]=0;
		return highestNumber;
	}

	int getNthHighestNumber(int[] array,int nth) {
		int nthHighest=0;
		for(int j=0;j<nth;j++) {
			nthHighest=getHighestNumber(array);
		}
		return nthHighest;
	}
	public static void main(String[] args) {
		Assignment_28_program2 program2= new Assignment_28_program2();
		int[] array = {10,23,2,11,55,43,99};
		int nthHighest=program2.getNthHighestNumber(array,3);
		System.out.println("Nth Highest number is "+nthHighest);
	}
}
