/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package monika;

public class Assignment28_Program_2 {

	int getMaxNumber(int[] input) {
		int max=input[0];
		int index=0;
		for(int index1=0; index1<input.length;index1++) {
			if(input[index1]>max) {
				max=input[index1];
				index=index1;
			}
		}
		input[index]=0;
		return max;
	}
	
	int getNthHighest(int[] input, int number) {
		int nthHighest=0;
		while(number>0) {
			nthHighest=getMaxNumber(input);
			number--;
		}
		return nthHighest;
	}
	public static void main(String[] args) {
		int[] arr = {10,23,2,11,55,43,99};
		Assignment28_Program_2 assignment28_Program_2=new Assignment28_Program_2();
		System.out.println("3rd Highest Numbeer is: "+assignment28_Program_2.getNthHighest(arr,3));
	}
}
