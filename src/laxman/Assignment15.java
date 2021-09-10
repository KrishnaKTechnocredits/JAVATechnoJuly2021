package laxman;

public class Assignment15 {

	void diff() {

		String a[] = { "Maulik", "Techno", "Nidhi", "Ankit" };

		int sumEven = 0, sumOdd = 0;

		for (int i = 0; i < a.length; i++) {

			int length = a[i].length();

			if (length % 2 == 0) {
				sumEven += a[i].length();
			} else {

				sumOdd += a[i].length();

			}
		}
		for (int j = 0; j < a.length; j++) {

			int length = a[j].length();

			int midPosition = length / 2;

			if (length % 2 == 0) {

				System.out.println(a[j].charAt(midPosition - 1));

			} else {
				System.out.println(a[j].charAt(midPosition));
			}
		}
		System.out.println("Difference of even length name and odd length name is");
		System.out.println(sumEven - sumOdd);

	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		System.out.println(
				"Middle character of all elements of the String array Maulik\\\",\\\"Techno\\\",\\\"Nidhi\\\",\\\"Ankit\" are");
		assignment15.diff();

	}

}
