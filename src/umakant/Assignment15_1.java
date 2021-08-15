package umakant;

public class Assignment15_1 {

	int getDifferenceOfEvenAndOddLenghtNames(String[] names) {
		int sumOfEvenLengthNames = 0;
		int sumOfOddLengthNames = 0;
		for (int index = 0; index < names.length; index++) {
			int length = names[index].length();
			if (length % 2 == 0)
				sumOfEvenLengthNames += length;
			else
				sumOfOddLengthNames += length;
		}
		return (sumOfEvenLengthNames - sumOfOddLengthNames);
	}

	public static void main(String[] args) {
		Assignment15_1 assignment15_1 = new Assignment15_1();
		String[] names = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println(assignment15_1.getDifferenceOfEvenAndOddLenghtNames(names));
	}

}
