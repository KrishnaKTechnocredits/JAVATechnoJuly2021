package riten;

class FiveSmallerNum {

	int count;

	void returnFiveSmallerNum(int num) {
		int index = num;

		while (index <= num) {
				System.out.println(index-1);
			index--;
			count++;

			if (count == 5)
				break;

		}

	}

	public static void main(String[] args) {
		FiveSmallerNum smallnum = new FiveSmallerNum();
		smallnum.returnFiveSmallerNum(50);

	}
}