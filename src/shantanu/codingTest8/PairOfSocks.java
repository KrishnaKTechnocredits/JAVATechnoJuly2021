package shantanu.codingTest8;

public class PairOfSocks {
	int getTotalPairs(int[] input) {
		int total=0;
		for(int index = 0; index < input.length; index++) {
			int size = input[index];
			int count = 0;
			for(int innerIndex = 0; innerIndex < input.length; innerIndex++)
				if(size == input[innerIndex] && input[innerIndex] != 0) {
					count++;
					input[innerIndex] = 0;
				}
			total += count/2;
		}
		return total;
	}
	void displayTotalPairs(int[] input) {
		System.out.println("Total pairs of socks are: "+getTotalPairs(input));
	}
	public static void main(String[] args) {
		PairOfSocks pairOfSocks = new PairOfSocks();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		pairOfSocks.displayTotalPairs(input);
	}
}
