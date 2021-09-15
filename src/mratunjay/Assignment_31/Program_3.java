package mratunjay.Assignment_31;

public class Program_3 {

	int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };

	void getCountOfTrippletNumbers() {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			
			if (index < arr.length -2) {
			if (arr[index] + 1 == arr[index + 1] && arr[index + 1] + 1 == arr[index + 2])
				count++;
		}
	}
		System.out.println("Number of tripplets: " + count);

	}

	public static void main(String[] args) {

		Program_3 P_3 = new Program_3();
		P_3.getCountOfTrippletNumbers();

	}
}
