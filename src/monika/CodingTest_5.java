package monika;

public class CodingTest_5 {
	boolean isPerfectNumber(long input) {
		long output = 0;
		for (long index = 1; index < input; index++) {
			if (input % index == 0) {
				output += index;
			}
		}
		if (output == input)
			return true;
		return false;
	}
	void printFirstNPerfectNumbers(int n) {
		int count = 0;
		long perfectNumber = 1;
		while (count <= 5) {
			if (isPerfectNumber(perfectNumber)) {
				count++;
				System.out.println(perfectNumber);
			}
			perfectNumber++;
		}
	}
	public static void main(String[] args) {
		CodingTest_5 test1= new CodingTest_5();
		test1.printFirstNPerfectNumbers(5);
	}
}
