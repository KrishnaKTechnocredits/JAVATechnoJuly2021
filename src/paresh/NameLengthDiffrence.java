package paresh;

public class NameLengthDiffrence {

	int findDifference(String[] input) {
		int evenLength = 0;
		int oddLength = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index].length() % 2 == 0)
				evenLength += input[index].length();
			else
				oddLength =oddLength + input[index].length();
		}
		return evenLength - oddLength;
	}

	int createArray() {
		String[] arr = {"Maulik","Techno","Nidhi","Ankit"};
		return findDifference(arr);
	}

	void displayDifference() {
		System.out.println("Difference between lengths of even and odd names is: "+createArray());
	}

	public static void main(String[] args) {
		NameLengthDiffrence nameLengthDifference = new NameLengthDiffrence();
		nameLengthDifference.displayDifference();
	}
} 