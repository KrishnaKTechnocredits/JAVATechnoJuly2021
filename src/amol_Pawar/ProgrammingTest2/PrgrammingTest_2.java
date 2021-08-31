package amol_Pawar.ProgrammingTest2;

public class PrgrammingTest_2 {

	void ConverString(String input) {

		String arr[] = new String[input.length()];
		for (int index = 0; index < input.length(); index++) {
			String str = "";
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				arr[index] = str + Character.toLowerCase(ch);

			} else if (ch >= 97 && ch <= 122) {
				arr[index] = str + Character.toUpperCase(ch);

			} else {
				arr[index] = str + input.charAt(index);
			}
		}
		System.out.println("Output of String " + input + "is given below");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index]);
		}
	}

	public static void main(String[] args) {
		PrgrammingTest_2 prgrammingTest_2 = new PrgrammingTest_2();
		prgrammingTest_2.ConverString("A1ashVi6");

	}

}
/*
 * Convert all lowercase to uppercase and uppercase to lowercase in a given
 * string.
 * 
 * Input : A1ashVi6 Output : a1ASHvI6
 */
