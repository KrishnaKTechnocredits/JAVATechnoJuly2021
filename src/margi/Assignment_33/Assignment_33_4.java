package margi.Assignment_33;

public class Assignment_33_4 {

	//find the triplet which in sequence and having maximum sum
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
		Assignment_33_4 assignment_33_4 = new Assignment_33_4();
		int[] arr = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		int number1 = assignment_33_4.getTriplets(arr);
		int number2 = number1+1;
		int number3 = number1+2;
		System.out.println(number1 + ", "+ number2 + ", " + number3 + " is a triplet having maximum sum");
	}
}
