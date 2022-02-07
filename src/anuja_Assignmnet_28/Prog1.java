/* Assignment - 28 : 4th Sep'2021
Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55
 */
package anuja_Assignmnet_28;

public class Prog1 {
	static int maxNum,secondMaxNum=0;
	int index=0;

	int[] highest(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum=arr[i];
				index=i;
			}
		}
		System.out.println("Maxnumber is "+maxNum);	
		arr[index]=0;
		return arr;
	}

	int[] secondHighest(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondMaxNum)
				secondMaxNum=arr[i];
		}
		System.out.println("Secondmax number is "+ secondMaxNum);
		return arr;
	}

	public static void main(String[] args) {
		Prog1 prog1=new Prog1();
		int[] arr = {10,23,2,11,55,43,99};
		prog1.secondHighest(prog1.highest(arr));
	}
}
