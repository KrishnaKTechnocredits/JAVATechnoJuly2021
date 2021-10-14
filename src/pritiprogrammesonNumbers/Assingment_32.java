package pritiprogrammesonNumbers;

public class Assingment_32 {
	int findTripleNumInSeqWithMaxSum(int[] input) {
		int sum=0; int maxSum=0; int maxtriplet=0;
		for (int index=0;index<input.length-2;index++) {
			int num = input[index];
			if ((num+1)==input[index+1])
				if ((num+2)==input[index+2])
					sum = num+(num+1)+(num+2);
			
			if (maxSum<sum) {
				maxSum=sum;
				maxtriplet = index;
			}
		}
		
		return input[maxtriplet];
	}
	
	
	public static void main(String [] a) {
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		Assingment_32 assingment_32 = new Assingment_32();
		int num1 = assingment_32.findTripleNumInSeqWithMaxSum(arr);
		int num2= num1+1;
		int num3 = num2+1;
		
		System.out.println("Triple which in sequence and has max sum is :" + num1+","+num2+","+num3);
		System.out.println("Max Sum of triple is :" +(num1+num2+num3));
	}
	
	
	
	

}
/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
