package devendra_Assignment_21;

//Find Age Difference Between Oldest And Youngest Family Members
<<<<<<< Updated upstream

public class Assignment21_DiffBetweenOld_Young {
=======
public class Assignment21_DiffBetweenOld_Young {

>>>>>>> Stashed changes
	void printDiffBetweenOld_Young(int[] inputAge) {
		int max = 0;
		int min = inputAge[0];

		for (int index = 0; index < inputAge.length; index++) {
			if (max < inputAge[index])
				max = inputAge[index];

<<<<<<< Updated upstream
			if (min > inputAge[index])
				min = inputAge[index];
		}

		System.out.println("Difference Between Oldest & Youngest Family Member : " + (max - min));
=======
		if (min > inputAge[index])
			min = inputAge[index];
		}
		System.out.println("Difference Between Oldest & Youngest Family Member Age : " + (max - min));
>>>>>>> Stashed changes
	}

	public static void main(String[] args) {
		Assignment21_DiffBetweenOld_Young a21_OldYoung = new Assignment21_DiffBetweenOld_Young();
		int[] inputAge = { 10, 34, 38, 68, 72, 95, 6 };
		a21_OldYoung.printDiffBetweenOld_Young(inputAge);
	}
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
