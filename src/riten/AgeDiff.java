package riten;

class AgeDiff {

	int oldage = 0;
	int yongage = 0;
	int diff = 0;

	void returnMaxMinAge(int[] arr) {

		int max = 0;
		int min = arr[0];

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] > max) {
				max = arr[index];
				oldage = max;
			} else if (arr[index] < min) {
				min = arr[index];
				yongage = min;
			}

		}
	}

	void returnDiff() {
		diff = oldage - yongage;
		System.out.println("Diffrence between Old and young age in family is " + diff);

	}

	public static void main(String[] args) {
		AgeDiff agediff = new AgeDiff();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		agediff.returnMaxMinAge(age);
		agediff.returnDiff();

	}

}