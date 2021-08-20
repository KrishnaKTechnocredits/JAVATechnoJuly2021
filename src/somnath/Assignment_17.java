
package somnath;
public class Assignment_17 {
	String getReverseString(String input) {
		String output = "";
		for(int index=input.length();index>0;index--)
		{
			output = output + input.charAt(index-1);

		}
		return output;
	}

	public static void main(String[] args) {
	    String input = "technocredits";
		Assignment_17 assignment_17 = new Assignment_17();
		System.out.println("--------------------*****---------------------------------");
		System.out.println("Reverse of input string is '" + input + "' is " + assignment_17.getReverseString(input));
		System.out.println("--------------------*****----------------------------------");
	}

}


 