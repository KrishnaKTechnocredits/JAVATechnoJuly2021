/*WAP to determine length of string using try catch block */

package suruchi.Assignment43;

public class Program_A43 {

	void printStringLengthUsingTryCatch(String str) {
		int count = 0;
		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("String length determined using try catch block: " + count);
	}

	public static void main(String[] args) {
		Program_A43 program_A43 = new Program_A43();

		String str = "technocredits";
		System.out.println("String is: " + str);
		program_A43.printStringLengthUsingTryCatch(str);
	}
}