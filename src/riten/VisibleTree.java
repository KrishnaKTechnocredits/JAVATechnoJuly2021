package riten;

class VisibleTree {

	int count = 0;

	void findCount(int[] arr) {
		int visiblecount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > visiblecount) {
				visiblecount = arr[index];
				count++;
			} else if (arr[index] == visiblecount) {
				visiblecount = arr[index];
			}

			else if (arr[index] < visiblecount) {

			}
		}

		System.out.println("COunt of visible tree is: " + count);
	}

	public static void main(String[] args) {
		VisibleTree visibletree = new VisibleTree();
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		visibletree.findCount(treeHeights);

	}
}