package mratunjay;

public class Assignment_27 {

	void checkIdenticalArray(int[] a1, int[] a2) {
		boolean flag = false;
		if (a1.length == a2.length) {

			for (int index = 0; index < a1.length; index++) {

				if (a1[index] == a2[index]) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}

		}
		
		if (flag)
		System.out.println("Array is identical");
		else 
		System.out.println("Array is not identical");
	
	}

	public static void main(String[] args) {

		int[] input1 = {10,12,55,32,17,21};
		int[] input2 = {10,12,55,32,17};

		Assignment_27 A_27 = new Assignment_27();
		A_27.checkIdenticalArray(input1, input2);

	}

}
