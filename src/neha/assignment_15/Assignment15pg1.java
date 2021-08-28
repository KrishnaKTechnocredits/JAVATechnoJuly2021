package neha.assignment_15;

/*program 1:  wap that will return difference of even length name and odd length name.
arr[0] = "Maulik";
arr[1] = "Techno";
arr[2] = "Nidhi";
arr[3] = "Ankit";
output : 2*/
public class Assignment15pg1 {
	int diffEvenAndOddLengthName(String[] nameArray) {
		int evenLengthSum, oddLengthSum;
		evenLengthSum = 0;
		oddLengthSum = 0;
		for (int index = 0; index < nameArray.length; index++) {
			if (nameArray[index].length() % 2 == 0)
				evenLengthSum += nameArray[index].length();
			if (nameArray[index].length() % 2 != 0)
				oddLengthSum += nameArray[index].length();
		}
		return evenLengthSum - oddLengthSum;

	}

	public static void main(String[] args) {
		Assignment15pg1 assignment15pg1 = new Assignment15pg1();
		String[] nameArr = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println("Difference of even length name and odd length name in given name array is "
				+ assignment15pg1.diffEvenAndOddLengthName(nameArr));
	}
}
