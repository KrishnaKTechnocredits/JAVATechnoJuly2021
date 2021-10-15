package dattaraj;

public class Assignment_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "technocredits";
		Assignment_43 assignment_43 = new Assignment_43();
		assignment_43.getLength(str);
	}
	
	void getLength(String input) {
		int count = 0;
		while(true) {
			try {
				input.charAt(count);
				count++;
			} catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("The length of string '" + input + "' is " + count);
	}
}
