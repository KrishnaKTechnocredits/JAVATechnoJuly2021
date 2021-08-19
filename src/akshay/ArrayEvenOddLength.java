package akshay;

public class ArrayEvenOddLength {
	
	int length = 0;
	int evenlength = 0;
	int oddlength = 0;
	
	int evenArray(String[] num) {
		for(int index = 0; index< num.length; index++) {
			if (num[index].length() %2 == 0) 
				evenlength = evenlength + num[index].length();
		}
		return evenlength;
	}
	
	int oddArray(String[] num) {
		for(int index = 0; index< num.length; index++) {
			if (num[index].length() %2 != 0) 
				oddlength = oddlength + num[index].length();
		}
		return oddlength;
	}
	
	void diffEvenOddArray() {
		if(evenlength>oddlength)
			length = evenlength - oddlength;
		else
			length = oddlength - evenlength;

	}
	
	void displayOutput() {
		System.out.println("Difference between even and odd length strings: " +length);
	}
	
	
	public static void main(String[] args) {
		ArrayEvenOddLength arrayevenoddlength = new ArrayEvenOddLength();
		String [] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		arrayevenoddlength.evenArray(arr);
		arrayevenoddlength.oddArray(arr);
		arrayevenoddlength.diffEvenOddArray();
		arrayevenoddlength.displayOutput();
	}
}
