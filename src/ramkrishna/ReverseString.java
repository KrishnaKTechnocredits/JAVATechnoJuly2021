package ramkrishna;

public class ReverseString {

	void getReverseString(String input) {
		char reversechar;
		System.out.println("The reverse string of" + input + " is ");
		for (int index = input.length() - 1; index >= 0; index--) {
			reversechar = input.charAt(index);
			System.out.print(reversechar);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "technocredits";
		  ReverseString reverserstring =new ReverseString();
		  reverserstring.getReverseString(input);

	}

}
