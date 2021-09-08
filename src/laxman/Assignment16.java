package laxman;

public class Assignment16 {

	void tall() {
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		int count = 0;

		for (int i = 0; i < treeHeights.length - 1; i++) {
			if (treeHeights[i] < treeHeights[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.tall();

	}

}
