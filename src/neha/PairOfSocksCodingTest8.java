package neha;

/*How many pairs can be created from below sock size array. [30, actual : 15 min]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */
public class PairOfSocksCodingTest8 {
	int[] socksSize = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };

	int totalPairOfSocks() {
		int totalPair = 0;
		for (int i = 0; i < socksSize.length; i++) {
			totalPair += individualPairOfSocks(socksSize, socksSize[i]);
		}
		return totalPair;
	}

	int individualPairOfSocks(int[] arr, int size) {
		int socksPair = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (size == arr[i] && arr[i] != 0) {
				count++;
				arr[i] = 0;
				if (count == 2) {
					socksPair++;
					count = 0;
				}
			}
		}
		return socksPair;
	}

	public static void main(String[] args) {
		PairOfSocksCodingTest8 pairOfSocksCodingTest8 = new PairOfSocksCodingTest8();
		System.out.println("Total pair of socks is " + pairOfSocksCodingTest8.totalPairOfSocks());
	}
}
