/*
 *Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
 */

package tanmoy_Roy.Assignment32;
import java.util.*;

public class Program {
	
	int[] maxSumTriplets(int[] input) {
		int[] arr=new int[3];
		int n=input.length,i=0,max=input[0]+input[1]+input[2],tripletSum;
		for (i=1;i<n-2;i++) {
			tripletSum=input[i]+input[i+1]+input[i+2];
			if(max<tripletSum) {
				max=tripletSum;
				arr[0]= input[i];
				arr[1]=input[i+1];
				arr[2]=input[i+2];
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		Program prg = new Program();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {

			System.out.println("Enter the array : ");
			String[] input = scan.nextLine().split(",");
			int[] arr1= new int[input.length];
			for(int i=0 ;i<input.length;i++)
				arr1[i]=Integer.parseInt(input[i]);
			System.out.println("The triplets with max value in the array  :"+ Arrays.toString(prg.maxSumTriplets(arr1)));
			
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();

	}

}
