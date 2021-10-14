package pritiprogrammesonNumbers;

public class Assingment_33_4 {
	int findTripleSeq(int input[]) {
		int sum=0;int maxSum=0;int maxTripleIndex=0;
		for(int index=0;index<input.length-2;index++) {
			int num=input[index];
			if ((num+1)==input[index+1])
				if ((num+2)==input[index+2]) 
					sum= num+(num+1)+(num+2);
			if (maxSum<sum) {
				maxSum=sum;
				maxTripleIndex=index;
			}
		}
		return input[maxTripleIndex];
	}
	
	
	public static void main(String[] a) {
		Assingment_33_4 assingment_33_4 = new Assingment_33_4();
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		int num1=assingment_33_4.findTripleSeq(input);
		int num2=num1+1;
		int num3=num2+1;
		System.out.println("Triple which in sequence are :"+num1+","+num2+","+num3);
		System.out.println("Sum of Triple in sequence is :"+ (num1+num2+num3));
	}

}

/*program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
