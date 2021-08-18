package deven_dc.assign;

public class Assignment13_P3 {

	int number;

	int[] arrayOfNumbers(int num) {
		number = num;
		int[] arr = new int[5];

		for (int index = 0; index < arr.length; index++) {
			num--;
			arr[index] = num;
		}
		return arr;
	}

	void displayNumbers() {
		int[] output = arrayOfNumbers(50);
		System.out.println("The List of 5 Numbers Less than "+number+" : ");
		for(int index=0; index < output.length; index++) {
			System.out.print(output[index]+" ");
		}
	}

	public static void main(String[] args) {
		Assignment13_P3 a13_p3 = new Assignment13_P3();
		a13_p3.displayNumbers();
	}

}