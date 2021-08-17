package shalaka.ArrayAssignment15;
/*
 *program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

 */

public class Program2_Assignment15 {

	char[] getmiddlechar(String arr[]) {
		char[] ch = new char[3];
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (str.length() % 2 == 0)
				ch[index] = str.charAt(str.length() / 2-1);
			else
				ch[index] = str.charAt(str.length() / 2 );
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "hello", "techno", "credits" };
		//char[] middleChar = new char[3];
		Program2_Assignment15 program_Assignment15 = new Program2_Assignment15();
		char[] middleChar = program_Assignment15.getmiddlechar(arr);
		// System.out.println("Middle character of all elements of the String array: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println("the middle character of " + arr[index] + " is " + middleChar[index]);

		}

	}

}
