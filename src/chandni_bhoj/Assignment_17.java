package chandni_bhoj;

public class Assignment_17 {
	
	String getReverseString (String object) {
		String output = " ";
		for (int index = object.length()-1; index>=0; index--) {
			output = output + object.charAt(index);
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.getReverseString("technocredits");
		System.out.println(assignment_17.getReverseString("technocredits"));
	}
	
}