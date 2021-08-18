package shantanu.stringreverse;

public class ReverseString {
	String getReverseString(String str) {
		String reverse = "";
		for(int index = str.length()-1; index >= 0; index--)
			reverse = reverse + str.charAt(index);
		return reverse;
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String str = "Shantanu";
		String reverseStr = reverseString.getReverseString(str);
		System.out.println("Reverse of "+str+" is "+reverseStr);
	}
}
