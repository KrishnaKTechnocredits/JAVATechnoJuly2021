package chirag.assignment18;

public class ArrayElementsInReversePosition {

	String getReverseString(String str) {
		String output = "";
		for(int index = str.length() - 1;index >= 0 ; index --) {
			output = output + str.charAt(index);
		}
		return output;
	}
	String [] reverseStringInReverseOrder(String [] input) {
		for(int index = 0;index < input.length;index++) {
			String reverse = getReverseString(input[index]);
		}
		return input;
	}
	String [] getReverseStringArray(String [] input) {
		for(int index=0;index < input.length;index++) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}
	public static void main(String[] args) {
		ArrayElementsInReversePosition reversePosition = new ArrayElementsInReversePosition();
		
		String [] input = {"Yash","Rahul"}; 
		reversePosition.getReverseStringArray(input);
		for(int index = 0;index < input.length;index ++) {
			System.out.println(input[index]);
		}
	}
}
