package shantanu.assignment15;

public class NameLengthDifference {
	int findDifference(String[] input) {
		int evenLength = 0 , oddLength = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index].length() % 2 == 0)
				evenLength += input[index].length();
			else
				oddLength += input[index].length();
		}
		return evenLength - oddLength;
	}
	
	int createArray() {
		String[] arr = {"Maulik","Techno","Nidhi","Ankit"};
		return findDifference(arr);
	}
	
	void displayDifference() {
		System.out.println("Difference between lengths of even names and lengths of odd names is: "+createArray());
	}
	
	public static void main(String[] args) {
		NameLengthDifference nameLengthDifference = new NameLengthDifference();
		nameLengthDifference.displayDifference();
	}
}
