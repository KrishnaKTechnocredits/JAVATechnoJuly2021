package swati;
import java.util.Arrays;
class ReverseAllElements{
	
	String returnReverseString(String input){
		String reverseString="";
		int stringLength=input.length();
		for(int index=input.length()-1;index>=0;index--){
			reverseString=reverseString+input.charAt(index);
		}
		return reverseString;
	}
	
	String[] returnReverseElementArray(String[] input){
		ReverseAllElements revElement=new ReverseAllElements();
		for(int index=0;index<input.length;index++){
			input[index]=revElement.returnReverseString(input[index]);
		}
		return input;
	}
	
	public static void main(String[] a){
	ReverseAllElements reverAllElement=new ReverseAllElements();
	String[] input={"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
	String[] reverseArray=reverAllElement.returnReverseElementArray(input);
	System.out.println("OutPut:\n"+Arrays.toString(reverseArray));
	
	}
}