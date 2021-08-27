/*Assignment 13 : 15th Aug'2021
program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4
 */

package ritabrata;

public class CountZero {
	int inputNumber(int[] input) {
		int count=0;
		for(int number=0; number<input.length; number++) {
			if(input[number]==0) {
				count++;
			}
		}
		System.out.println("The total no if positive integer is: "+count);
		return count;
	}
		
	public static void main(String[] args) {
		CountZero countZero= new CountZero();
		int[] arr= new int[8];
		arr[0]=1;
		arr[1]=-11;
		arr[2]=-0;
		arr[3]=0;
		arr[4]=55;
		arr[5]=0;
		arr[6]=-23;
		arr[7]=0;
		countZero.inputNumber(arr);
		

	}

}
