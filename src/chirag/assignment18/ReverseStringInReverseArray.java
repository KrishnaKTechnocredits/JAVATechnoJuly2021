package chirag.assignment18;

public class ReverseStringInReverseArray {

	String getReverseString(String str) {
		String output = "";
		for(int index = str.length() - 1;index >= 0;index --) {
			output = output + str.charAt(index);
		}
		return output;
	}
	String [] reverseOrder(String [] input) {
		for(int index = input.length - 1;index >= 0; index--) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}
	
	public static void main(String[] args) {
		ReverseStringInReverseArray reverseString = new ReverseStringInReverseArray();
		String [] input = {"Aarti","Aradhana",};
		reverseString.reverseOrder(input);
		System.out.println("Reverse string in reverse array :- ");
		for(int index=input.length -1;index >= 0;index--) {
			System.out.println(input[index]); 
			
		}
	}
}
