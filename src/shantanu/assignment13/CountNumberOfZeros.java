package shantanu.assignment13;

public class CountNumberOfZeros {
	int findZerosInArray(int[] arr) {
		int count=0;
		for(int index=0; index < arr.length; index++) {
			if(arr[index]==0)
				count++;
		}
		return count;
	}
	
	int createArray() {
		int[] input = {1,-11,0,0,55,0,-23,0};
		return findZerosInArray(input);
	}
	
	void displayCountOfZerosInArray() {
		System.out.println("Count of zeros in the array is: "+createArray());
	}
	
	public static void main(String[] args) {
		CountNumberOfZeros countNumberOfZeros = new CountNumberOfZeros();
		countNumberOfZeros.displayCountOfZerosInArray();
	}
}
