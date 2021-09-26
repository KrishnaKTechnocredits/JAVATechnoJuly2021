package rushikesh.assign33;

/*
 program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12

 */
public class Assign33_4 {
	
	void getTripletHavingMaxSum(int[] input) {
		int maxSum=0;
		int sum = 0;
		int tripindex=0;
		
		for(int index=0;index<input.length-2;index++) {

			if(input[index]+1==input[index+1] && input[index]+2==input[index+2] ) {
			sum=input[index]+input[index+1]+input[index+2];
				if(sum>maxSum) {
					maxSum=sum;
					tripindex=index;
				}
			}
		}
			System.out.println("The triple " + input[tripindex] + ", " + input[tripindex + 1] + ", " + input[tripindex + 2]
				+ " of consecutive numbers in the given array  has max sum " + maxSum);	
	}
	
	public static void main(String[] args) {
		Assign33_4 assign33_4=new Assign33_4();
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		assign33_4.getTripletHavingMaxSum(input);
	}
}
