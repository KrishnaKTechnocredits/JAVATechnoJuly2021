package mratunjay.JavaTest_4_5;

public class Test_4 {

	int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };

	void getZerosAtTheEnd(int[] arr) {

		int[] output = new int[arr.length];
		int count = 0;

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		for (int i = 0; i < output.length; i++) {
			
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {

		Test_4 T_4 = new Test_4();
		T_4.getZerosAtTheEnd(T_4.arr);

	}

}