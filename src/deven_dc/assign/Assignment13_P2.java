package deven_dc.assign;

public class Assignment13_P2 {
	int numCount;

	int countOfZeros(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0)
				numCount++;
		}
		return numCount;
	}

	public static void main(String[] args) {
		Assignment13_P2 a13_p2 = new Assignment13_P2();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		int count = a13_p2.countOfZeros(input);
		System.out.println("The Count of 0's in the Given Array : " + count);
	}

}