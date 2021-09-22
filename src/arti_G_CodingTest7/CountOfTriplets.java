package arti_G_CodingTest7;

/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25*/
public class CountOfTriplets {

	int countTriplets(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if ((arr[index + 2] > arr[index + 1]) && (arr[index + 1] > arr[index])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountOfTriplets countOfTriplets = new CountOfTriplets();
		int[] arr = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		System.out.println("No of triplets in increasing order is :" + countOfTriplets.countTriplets(arr));
	}

}
