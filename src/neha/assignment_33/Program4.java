package neha.assignment_33;
/*program 4 : find the triplet which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

public class Program4 {
	void displayTripletWithMaxSum(int[] arr) {
		int maxSum = 0;
		int sum = 0;
		int maxStartIndex = 0;
		System.out.println("Triplets are ");
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
				sum = arr[i] + arr[i + 1] + arr[i + 2];
				System.out.println(arr[i] + "," + arr[i + 1] + "," + arr[i + 2]);
				if (maxSum < sum) {
					maxSum = sum;
					maxStartIndex = i;
				}
			}
		}
		System.out.println("Triplet with maximum sum is [" + arr[maxStartIndex] + "," + arr[maxStartIndex + 1] + ","
				+ arr[maxStartIndex + 2] + "] and sum is " + maxSum);

	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		program4.displayTripletWithMaxSum(arr);
	}
}