package husain.Assignment26;

public class Program1 {

	void loopArray(String str) {
		String arr[] = str.split(" ");
		String output = "";

		for (int index = arr.length - 1; index >= 0; index--) {
			output = output + reverseString(arr[index]) + " ";
		}
		System.out.println("Output string: " + output.trim());
	}

	String reverseString(String str) {

		String rev = "";

		for (int index = str.length() - 1; index >= 0; index--)
			rev = rev + str.charAt(index);
		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		String str = "This is Technocredits";
		System.out.println("Input string: " + str);
		obj.loopArray(str);

	}

}
