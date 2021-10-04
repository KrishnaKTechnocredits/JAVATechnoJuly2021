/*Assignment - 43 : 30th Sep'2021 
 * WAP to find length of String without using Length Method and length property.
String input="technocredits";
output=13;*/
package monika;

public class Assignment_43 {

	static int getLengthOfString(String input) {
		int count=0;
		while(true) {
			try {
				input.charAt(count);
				count++;
			} catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input="technocredits";
		System.out.println("Length of '"+input+"' String is: "+Assignment_43.getLengthOfString(input));

}
}
