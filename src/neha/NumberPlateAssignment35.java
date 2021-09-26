package neha;

/*Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/public class NumberPlateAssignment35 {
	void verifyAndDisplayNumberPlateValidity(String str) {
		int pattern1MatchCount = 0;
		int pattern2MatchCount = 0;
		if (str.length() == 13) {
			String[] part = str.split(" ");
			if (part.length == 4) {
				char[] letterPartOne = part[0].toCharArray();
				char[] numberPartOne = part[1].toCharArray();
				char[] letterPartTwo = part[2].toCharArray();
				char[] numberPartTwo = part[3].toCharArray();
				if (part[0].length() == 2 && Character.isUpperCase(letterPartOne[0])
						&& Character.isUpperCase(letterPartOne[1]))
					pattern1MatchCount++;
				if (part[1].length() == 2 && Character.isDigit(numberPartOne[0]) && Character.isDigit(numberPartOne[1]))
					pattern1MatchCount++;
				if (part[2].length() == 2 && Character.isUpperCase(letterPartTwo[0])
						&& Character.isUpperCase(letterPartTwo[1]))
					pattern1MatchCount++;
				if (part[3].length() == 4 && Character.isDigit(numberPartTwo[0]) && Character.isDigit(numberPartTwo[1])
						&& Character.isDigit(numberPartTwo[2]) && Character.isDigit(numberPartTwo[3]))
					pattern1MatchCount++;
				// compare match count for pattern 1
				if (pattern1MatchCount == 4)
					System.out.println("Number plate [" + str + "] is Valid");
				else if (pattern1MatchCount < 4)
					System.out.println("Number plate [" + str + "] is invalid");
			} else if (part.length == 3) {
				char[] PartOne = part[0].toCharArray();
				char[] letterPart = part[1].toCharArray();
				char[] numberPart = part[2].toCharArray();
				if (part[0].length() == 5 && Character.isUpperCase(PartOne[0]) && Character.isUpperCase(PartOne[1])
						&& Character.isDigit(PartOne[3]) && Character.isDigit(PartOne[4]) && PartOne[2] == '-')
					pattern2MatchCount++;
				if (part[1].length() == 2 && Character.isUpperCase(letterPart[0])
						&& Character.isUpperCase(letterPart[1]))
					pattern2MatchCount++;
				if (part[2].length() == 4 && Character.isDigit(numberPart[0]) && Character.isDigit(numberPart[1])
						&& Character.isDigit(numberPart[2]) && Character.isDigit(numberPart[3]))
					pattern2MatchCount++;
				// compare match count for pattern 2
				if (pattern2MatchCount == 3)
					System.out.println("Number plate [" + str + "] is Valid");
				else if (pattern2MatchCount < 3)
					System.out.println("Number plate [" + str + "] is invalid");
			}
		} else {
			System.out.println("Number plate [" + str + "] is invalid");
		}
	}

	public static void main(String[] args) {
		NumberPlateAssignment35 numberPlateAssignment35 = new NumberPlateAssignment35();
		String p1 = "MH 12 BK 4432";
		numberPlateAssignment35.verifyAndDisplayNumberPlateValidity(p1);
		String p2 = "MH-12 BK 1432";
		numberPlateAssignment35.verifyAndDisplayNumberPlateValidity(p2);
		String p3 = "MH 12-BK 4432";
		numberPlateAssignment35.verifyAndDisplayNumberPlateValidity(p3);
		String p4 = "GJ 05 MK 1123";
		numberPlateAssignment35.verifyAndDisplayNumberPlateValidity(p4);
	}
}
