package suruchi.Assignment40;

public class Program_A40 {

	void printIntegersFromString(String str) {
		int strInteger = 0;
		String[] arr = str.split(" ");
		System.out.println("Numbers from the string are: ");
		for (int index = 0; index < arr.length; index++) {
			try {
				strInteger = Integer.parseInt(arr[index]);
				System.out.println(strInteger);
			} catch (NumberFormatException nfe) {

			}
		}
	}

	public static void main(String[] args) {
		Program_A40 program_a40 = new Program_A40();

		String str = "I have 5 years and 3 months of exp";
		System.out.println("String1 is: " + str);
		program_a40.printIntegersFromString(str);

		String str2 = "I have 15 years and 9 months of exp";
		System.out.println("\nString2 is: " + str2);
		program_a40.printIntegersFromString(str2);
	}
}