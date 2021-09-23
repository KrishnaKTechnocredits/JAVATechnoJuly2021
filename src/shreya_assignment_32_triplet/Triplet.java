package shreya_assignment_32_triplet;

public class Triplet {
	void getTripletAndMaxSum(int[] input) {
		int maxSum=0;
		int sum=0;
		int maxIndex=0;
		for(int index=0;index<input.length-2;index++) {
			int num=input[index];
			if(num+1==input[index+1] && num+2==input[index+2]) {
				sum=input[index]+input[index+1]+input[index+2];
				if(maxSum<sum) {
					maxSum=sum;
					maxIndex=index;
				}
			}
		}
		System.out.println("Triplet having maximum sum is: "+input[maxIndex]+","+input[maxIndex+1]+","+input[maxIndex+2]);
	}

	public static void main(String[] args) {
		Triplet triplet = new Triplet();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		triplet.getTripletAndMaxSum(arr);
	}

}
