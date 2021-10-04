/* WAP to find length of String without using Length Method and length property.
String input= "technocredits";
output=13 */
package mayurLengthOfStringWOLengthMethodAndProperty;

public class Assignment43 {
	
	void getLength(String input) {
		int count =0;
		while(true){
			try {
				input.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("The length of string '" + input + "' is :- " +count);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment43 assignment43 = new Assignment43();
		assignment43.getLength(input);
		

	}

}
