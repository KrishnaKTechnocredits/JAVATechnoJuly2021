/*Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
output : {1,6,2,3,4,5,0,0,0,0,0};

Test 5 :
Find first 5 perfect numbers.

*/

package ritabrata;

import java.util.Arrays;

public class Ritabrata_Test4_Test5 {
	void shiftZero(int[] input) {
		int count =0, n=input.length, j=input.length-1;
		int[] arr= new int[input.length];
		for(int i=0; i<n; i++) {
			if(input[i]!=0) {
				arr[count++]=input[i];
			}
			else
				arr[j--]=input[i];
		}
		System.out.println("The array after shifting the zeros: "+Arrays.toString(arr));
	}
	
	void perfectNo(long input) {
		
		long temp=input/2;
		double sum=0;
		while(temp!=0) {
			if(input%temp==0)
				sum=sum+temp;
			temp--;
		}
		if(input==sum) {
			{
				
			}
			System.out.print(input+" ,");
		}
	}
	void getPerfectNo() {
		long num=1;
		int count=0;
		System.out.println("The perfect numbers are: ");
		while(count<=6) {
			perfectNo(num);
			num++;
		}
	}

	public static void main(String[] args) {
		Ritabrata_Test4_Test5 test4= new Ritabrata_Test4_Test5();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		test4.shiftZero(arr);
		test4.getPerfectNo();
	}

}
