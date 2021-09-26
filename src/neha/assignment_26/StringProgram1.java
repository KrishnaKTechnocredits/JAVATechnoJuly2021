package neha.assignment_26;

/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT*/
public class StringProgram1 {
	String reverseString(String str) {
		String reverseStr = "";
		for (int index = str.length()-1; index >= 0; index--) {
			reverseStr = reverseStr + str.charAt(index);
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		StringProgram1 stringProgram1 = new StringProgram1();
		String input = "This is technocredits";
		System.out.println("Reversed string is-->" + stringProgram1.reverseString(input));

	}
}
