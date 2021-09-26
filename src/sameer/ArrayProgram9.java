/*program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}
Hint : charAt method of String class helps to retrieve character on given index */

package sameer;

public class ArrayProgram9 {

	char[] getMiddlecharacter(String[] arr) {
		char[] output = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int length = arr[index].length();
			if (length % 2 == 0) {
				int middleChar = (length / 2) - 1;
				output[index] = arr[index].charAt(middleChar);
			}
			if (length % 2 != 0) {
				int middleChar = (length / 2);
				output[index] = arr[index].charAt(middleChar);
			}
		}
		return output;

	}

	public static void main(String[] args) {
		ArrayProgram9 arrayprogram9 = new ArrayProgram9();
		String[] str = { "hello", "techno", "credits", "sameer", "zalke" };
		char[] output = new char[str.length];
		output = arrayprogram9.getMiddlecharacter(str);
		for (int index = 0; index < str.length; index++) {
			System.out.println("Middle charater of " + str[index] + " is " + output[index]);
		}
	}

}
