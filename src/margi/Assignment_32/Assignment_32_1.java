package margi.Assignment_32;

public class Assignment_32_1 {
	
	//triple having maximum sum
	int getTriplets(int[] input) {
		int num, sum, maxTriplet=0, maxSum=0;
		for(int index=0; index<input.length-2; index++) {
			sum=0;
			num=input[index];
			if((num+1)==input[index+1]) {
				if((num+2)==input[index+2]) {
					sum = num + (num+1) + (num+2);
				}
				if(maxSum<sum) {
					maxSum=sum;
					maxTriplet = index;
				}
			}
		}
		return input[maxTriplet];
	}
	public static void main(String[] args) {
		Assignment_32_1 assignment_32_1 = new Assignment_32_1();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		int number1 = assignment_32_1.getTriplets(arr);
		int number2 = number1+1;
		int number3 = number1+2;
		System.out.println(number1 + ", "+ number2 + ", " + number3 + " is a triplet having maximum sum");
	}
}
