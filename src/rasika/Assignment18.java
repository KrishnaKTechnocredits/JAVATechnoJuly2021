package rasika;

public class Assignment18 {
	
	String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
	
	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for(int index = 0; index < input.length; index++) {
			output[index] = getReverseString(input[index]);
		}
		return output;
	}
	String getReverseString(String input) {
		String reverse = "";
		for(int index = input.length()-1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String[] array = assignment18.getReverseArray(assignment18.input);
		System.out.println("Reverse Strings in array are:");
		for(int index =0; index < array.length; index++) {
			System.out.println(array[index]);
		}
		System.out.println("Reverse Strings in Reverse array are:");
		for(int index =array.length-1; index >= 0; index--) {
			System.out.println(array[index]);
		}
	}
}
