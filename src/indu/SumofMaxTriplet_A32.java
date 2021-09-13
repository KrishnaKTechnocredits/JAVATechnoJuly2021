/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package indu;


public class SumofMaxTriplet_A32 {
	
	void sumOfTriplet(int[] input)
	{
		int num;
		int sum =0;
		int maxIndex=0;
		for(int i=0;i<input.length-2;i++)
		{
			num = input[i];
			if(num+1== input[i+1] && num+2==input[i+2])
			{
				int tempSum = num+(num+1)+(num+2);
				if(tempSum>sum)
				{
					sum = tempSum;
					maxIndex=i;
				}
			}
			
		}
		System.out.println("The triplets "+input[maxIndex]+" "+input[maxIndex+1]+" "+input[maxIndex+2]+" is : "+sum);
	}
	
	public static void main(String[] args) {
		SumofMaxTriplet_A32 a32 = new SumofMaxTriplet_A32();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};

		a32.sumOfTriplet(arr);
	}
}
