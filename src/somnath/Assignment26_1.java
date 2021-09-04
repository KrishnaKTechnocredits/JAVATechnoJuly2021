		/*Program : 1 
		WAP to print Reverse a given String.
		input : This is technocredits
		output : stiderconhcet si sihT */
package somnath;
public class Assignment26_1 {
	void reverseStr(String input) {
		String output = "";
		for(int index=input.length()-1; index >=0; index--) {
			output = output + input.charAt(index);
		}
		System.out.println(output); 
	}
	public static void main(String[] args) {
		Assignment26_1 assignment26_1 = new Assignment26_1();
		String input = "This is technocredits";
		assignment26_1.reverseStr(input);
	}
}