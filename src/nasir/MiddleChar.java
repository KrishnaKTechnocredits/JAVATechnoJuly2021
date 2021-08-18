/*program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index*/

package nasir;

public class MiddleChar {
	char[] getMidCharOfStringArr(String[] input) {
		int midIndex = 0;
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				midIndex = input[index].length() / 2 - 1;
			} else {
				midIndex = input[index].length() / 2;
			}
			output[index] = input[index].charAt(midIndex);
		}
		return output;
	}
	
	public static void main(String[] args) {

		String[] input = { "hello", "techno", "credits" };
		char[] output = new char[input.length];
		MiddleChar middleChar = new MiddleChar();
		output = middleChar.getMidCharOfStringArr(input);
		for (int index = 0; index < output.length; index++) {
			System.out.println("Middle Character of string '" + input[index] + "' is " + output[index]);
		
		}
	}
}