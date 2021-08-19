package swati;
class ReverseString{
	String reverseString="";
	
	String returnReverseString(String input){
		int strLength=input.length();
		String reverseString="";
		for(int index=strLength-1;index>=0;index--){
			
			reverseString=reverseString +input.charAt(index);
		}
		return reverseString;
	}
	
	public static void main(String[] a){
		ReverseString reverseStr= new ReverseString();
		String output=reverseStr.returnReverseString("technocredits");
		System.out.println("Output:"+ output);
	}
}
		