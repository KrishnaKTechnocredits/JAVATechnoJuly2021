package laxman;

public class Assignment18 {

	void reverse() {
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		String rev = "";

		for (int i = 0; i < input.length; i++) {

			char[] ch = input[i].toCharArray();

			for (int j = ch.length - 1; j >= 0; j--) {
				rev = rev + ch[j];

			}
		}
		System.out.println(rev + " ");

	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.reverse();
	}

}
