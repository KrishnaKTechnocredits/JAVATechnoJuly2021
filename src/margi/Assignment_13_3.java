package margi;

public class Assignment_13_3 {

	//returns 5 smaller numbers of the given number.
	int[] getNumbers(int num) {
		int[] output = new int[5];
		for(int index=0; index < 5; index++) {
			num--;
			output[index]=num;
		}
		return output;
	}
	
	void displayNumbers() {
		int[] num = new int[5];
		num = getNumbers(50);
		for(int index=0; index < 5; index++) {
			System.out.println(num[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment_13_3 numbers = new Assignment_13_3();
		numbers.displayNumbers();
	}
}
