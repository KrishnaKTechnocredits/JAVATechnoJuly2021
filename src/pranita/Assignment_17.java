package pranita;

public class Assignment_17 {

	    String getReverseString(String input){
		char[] string = input.toCharArray();
		System.out.println("Your given string is : " + input);
		System.out.println("String after reverse is:");
		for(int i = string.length-1; i >= 0 ; i--) {
				System.out.print(string[i]);
		}
		String output = null;

			return output;
		}

		public static void main(String[] a) {
			Assignment_17 assignment_17 = new Assignment_17();
			String output = null;
			output = assignment_17.getReverseString("technocredits");
		} 
	}