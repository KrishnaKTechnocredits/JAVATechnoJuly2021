package amol_Pawar.assignment_26;

public class Program_1 {

	void getReverseString(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			rev = rev + ch;
		}
		System.out.println("reverse String of "+ input+" given below");
		System.out.println( rev);
	}

	public static void main(String[] args) {

		Program_1 program_1 = new Program_1();
		program_1.getReverseString("This is technocredits");
	}
}

/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */
