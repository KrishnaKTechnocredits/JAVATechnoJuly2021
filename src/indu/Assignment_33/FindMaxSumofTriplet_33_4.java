/*input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
package indu.Assignment_33;

import java.util.Arrays;

public class FindMaxSumofTriplet_33_4 {

		int findMaxSum(int[] input)
		{
			int sum=0;
			int tempSum=0;
			int temp;
			int maxIndex=0;
			for(int index=0;index<input.length-2;index++)
			{
				temp=input[index];
				if(temp+1==input[index+1] && temp+2==input[index+2])
				{
					tempSum=temp+(temp+1)+(temp+2);	
				}
				if(tempSum>sum)
				{
					sum=tempSum;
					maxIndex=index;
				}
			}
			System.out.println("The Max Sequenc from given array is : ["+input[maxIndex]+" "+input[maxIndex+1]+" "+input[maxIndex+2]+"]");
			return sum;
		}
		
		public static void main(String[] args) {
			FindMaxSumofTriplet_33_4 findMaxSumofTriplet = new FindMaxSumofTriplet_33_4();
			int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
			System.out.println("Input Array to find max Ssum of Sequence is :\n"+Arrays.toString(input));
			System.out.println("Sum of the Max Sequence is " +findMaxSumofTriplet.findMaxSum(input));
		}
}
