/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
*/
package elizabeth;
import java.util.Arrays;

class Assignment32{
	
	
	int[] getMaxSumTriplet(int[] input){
		int sum=0;
		int maxSum=0;
		int[] output=new int[3];
		for(int index=0;index<input.length-2;index++){
			if((input[index+1]-input[index]==1)&&(input[index+2]-input[index]==2)){
				sum=input[index]+input[index+1]+input[index+2];
				if(maxSum<sum){
					maxSum=sum;
					output[0]=input[index];
					output[1]=input[index+1];
					output[2]=input[index+2];
				}
			}
		}
		return output;
		
	}
	
	public static void main(String[] args){
		Assignment32 assignment32=new Assignment32();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		System.out.println("Maximum sum triplet is " +Arrays.toString(assignment32.getMaxSumTriplet(arr)));
		
	}
}