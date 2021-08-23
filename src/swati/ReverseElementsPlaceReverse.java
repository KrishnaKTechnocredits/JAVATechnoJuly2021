package swati;
import java.util.Arrays;
class ReverseElementsPlaceReverse{
	
	String returnReverseString(String input){
		String reverseString="";
		for(int index=input.length()-1;index>=0;index--){
			reverseString=reverseString+input.charAt(index);
		}
		return reverseString;
	}
	
	String[] returnReverseSamePosition(String[] input){
		ReverseElementsPlaceReverse revElement=new ReverseElementsPlaceReverse();
		String[] output=new String[input.length];
		int position=0;
		for(int index=input.length-1;index>=0;index--){
			input[index]=revElement.returnReverseString(input[index]);
			output[position]=input[index];
			position++;
		}	
		
		return output;
	}
	
	
	
	public static void main(String[] a){
	ReverseElementsPlaceReverse reverAllElement=new ReverseElementsPlaceReverse();
	String[] input={"techno", "credits", "krishna","harsh"};
	String[] reverseArray=reverAllElement.returnReverseSamePosition(input);
	System.out.println("OutPut:\n"+Arrays.toString(reverseArray));
	
	}
}