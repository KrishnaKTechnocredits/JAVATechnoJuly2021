package parthav.parthavD_Assignment_21;

public class FindDifferenceBetweenOldestAndYoungest {

	void printDifferenceBetweenOldestYoungest(int[] inputAge) {
		int maxNumber = 0;
		int minNumber = inputAge[0];

		for (int index = 0; index < inputAge.length; index++) {
			if (maxNumber < inputAge[index])
				maxNumber = inputAge[index];

			if (minNumber > inputAge[index])
				minNumber = inputAge[index];

		}

		System.out.println("The difference between oldest and youngest family member is: " + (maxNumber - minNumber));
	}

	public static void main(String[] args) {
		FindDifferenceBetweenOldestAndYoungest newObject = new FindDifferenceBetweenOldestAndYoungest();
		int[] inputAge = { 10, 34, 38, 68, 72, 95, 6 };
		newObject.printDifferenceBetweenOldestYoungest(inputAge);
	}

}
