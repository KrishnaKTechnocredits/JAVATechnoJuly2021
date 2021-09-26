package riten;

public class MiddleCharOfEle {

	void evenNames(String[] arr) {
		int nameLen;
		int mid;
		String name = "";

		for (int i = 0; i < arr.length; i++) {
			// System.out.print(" "+arr[i]);
			name = arr[i];
			nameLen = (arr[i].length());
			mid = nameLen / 2;

			for (int j = 0; j <= nameLen; j++) {
				if (j == mid)
					System.out.println("Mid character of " + arr[i] + " is: " + name.charAt(j));
			}
		}
	}

	public static void main(String[] args) {
		String[] str = { "hello", "techno", "credits" };
		MiddleCharOfEle m1 = new MiddleCharOfEle();
		m1.evenNames(str);

	}
}