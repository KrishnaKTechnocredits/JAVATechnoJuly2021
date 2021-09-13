package arti_G_CodingTest8;

/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5*/
public class SocksSize {

	int pairCount(int[] arr) {
		int output = 0;
		int totalPair = 0;
		for (int index = 0; index < arr.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && arr[innerIndex] != 0) {
					count++;
					arr[innerIndex] = 0;
				}
			}
			output = count / 2;
			totalPair = totalPair + output;
		}
		return totalPair;
	}

	public static void main(String[] args) {
		SocksSize socksSize = new SocksSize();
		int[] arr = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		System.out.println("Total no. of pair : " + socksSize.pairCount(arr));
	}

}
