package sayli_Vyavhare;

public class Assignment_17_ReverseString {
	
	void getReverseString(String str) {
		String reverseString="";
		System.out.println("Provided String is:"+str);
		for(int index=str.length()-1;index>=0;index--) {
		   reverseString += str.charAt(index);
		   }
		System.out.println("Reverse String is:"+reverseString);
	}
	
	public static void main(String[] args) {
		Assignment_17_ReverseString assignment_17_reversestring=new Assignment_17_ReverseString();
		assignment_17_reversestring.getReverseString("Technocredits");	
		assignment_17_reversestring.getReverseString("Techno");
	}
}
