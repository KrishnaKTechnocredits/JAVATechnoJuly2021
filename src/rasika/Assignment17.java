package rasika;

public class Assignment17 {
	String getReverseString(String input) {
		String reverse = "";
		for(int index = input.length() -1 ; index >= 0; index--) {
			 reverse = reverse + input.charAt(index);
		}
		//System.out.println("Reverse string is "+reverse);
		return reverse;
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String stringToBeReverse = "technocredits";
		System.out.println("Reverse string for "+ stringToBeReverse +" is " +assignment17.getReverseString(stringToBeReverse));
	}

}
