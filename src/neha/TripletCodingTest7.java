package neha;

/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins, actual : 5 min]
input : 10,9,11,6,23,25,22,66,34
output : 1
hint : 6,23,25*/
public class TripletCodingTest7 {
	void countAndDisplayTripletsInIncreasingOrder(int[] arr) {
		System.out.println("Triplets in increasing order : ");
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2])
				System.out.println(arr[i] + "," + arr[i + 1] + "," + arr[i + 2]);
		}
	}

	public static void main(String[] args) {
		TripletCodingTest7 tripletCodingTest7 = new TripletCodingTest7();
		int[] tripletArr = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		tripletCodingTest7.countAndDisplayTripletsInIncreasingOrder(tripletArr);
	}
}
