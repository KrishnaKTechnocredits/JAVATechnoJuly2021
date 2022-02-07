/* Assignment - 28 : 4th Sep'2021
Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
 */

package anuja_Assignmnet_28;

import java.util.Scanner;

public class Prog2 {

	static int index=0;
	int output=0;
	int[] arr = {10,23,2,11,55,43,99};

	int highest(int[] arr) {
		int maxNum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum=arr[i];	
				index=i;
			}
		}
		arr[index]=0;
		return maxNum;
	}

	int calculate(int n) {
		for(int i=0;i<n;i++) { //i=0,1,2
			output=highest(arr); //1st =0,2nd=0
		}
		return output;
	}

	public static void main(String[] args) {
		Prog2 prog2=new Prog2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scanner.nextInt();
		System.out.println("The "+n+ "th highest element in the array is "+prog2.calculate(n));
	}
}
