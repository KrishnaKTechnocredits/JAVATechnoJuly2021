package vivek;

public class Assignment16 {

	int getVisibleTreesCount(int[] input) {

		int cnt = 0;
		int maxHeight = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxHeight) {
				maxHeight = input[index];
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		int[] treeheights = { 3, 5, 5, 11, 9, 10, 15, 14 };

		System.out.println("No of visible trees are " + assignment16.getVisibleTreesCount(treeheights));
	}

}
