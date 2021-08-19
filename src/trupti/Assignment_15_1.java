package trupti;

public class Assignment_15_1 {

	void diffOfEvenAndOddNo(String[] arr) {
		int evenLength = 0;
		int oddLength = 0;
		int diffSum = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				evenLength += arr[index].length();
			} else{//if(arr[index].length() % 2 != 0) {
				oddLength += arr[index].length();
			}
		}
		diffSum = evenLength - oddLength;
		System.out.println(diffSum);
	}

	public static void main(String[] args) {
		Assignment_15_1 assignment_15_1 = new Assignment_15_1();
		String[] str = { "Trupti", "Mandar", "Manik", "AlkaK"};
		assignment_15_1.diffOfEvenAndOddNo(str);
	}
}