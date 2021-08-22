package sourabh;

public class Assignment_17 {                  // Reverse String

	void reverseString(String str) {
		System.out.print("Reverse String of 'technocredits' : ");
		for(int index = str.length()-1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}
	public static void main(String[] args) {
		Assignment_17 reversestr = new Assignment_17();
		reversestr.reverseString("technocredits");
	}
}
