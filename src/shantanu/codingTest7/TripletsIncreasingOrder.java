package shantanu.codingTest7;

public class TripletsIncreasingOrder {
	int getNumberOfTripletsWithIncreasingOrder(int[] input) {
		int total = 0;
		for(int index = 0; index < input.length-2; index++) {
			if(input[index] < input[index+1] && input[index+1] < input[index+2])
				total++;
		}
		return total;
	}
	void displayNumberOfTripletsWithIncreasingOrder(int[] input) {
		System.out.println("Number of triplets in increasing order is: "+getNumberOfTripletsWithIncreasingOrder(input));
	}
	public static void main(String[] args) {
		TripletsIncreasingOrder tripletsIncreasingOrder = new TripletsIncreasingOrder();
		int[] input = {10,9,11,6,23,25,22,66,34};
		tripletsIncreasingOrder.displayNumberOfTripletsWithIncreasingOrder(input);
	}
}
