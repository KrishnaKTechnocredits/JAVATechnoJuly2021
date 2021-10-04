package avinash.assignment43;

/*WAP to find length of String without using Length Method and length property.
String input="technocredits";
output=13;*/
public class Assignment43 {

	static int getLengthofString(String input) {
		int count = 0;
		while (true) {
			try {
				input.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		System.out.println("Length of '" + input + "' string is: " + Assignment43.getLengthofString(input));

	}

}
