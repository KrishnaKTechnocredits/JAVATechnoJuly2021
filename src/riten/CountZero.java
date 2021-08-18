package riten;

class CountZero {

	int count;

	int returnCountZero(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index]==0)
			count++;

		}

		return count;

	}

	public static void main(String[] args) {
		CountZero countzero = new CountZero();
		int[] arr = {1,-11,0,0,55,0,-23,0};
		System.out.println("count of Zero is " + countzero.returnCountZero(arr));

	}

}