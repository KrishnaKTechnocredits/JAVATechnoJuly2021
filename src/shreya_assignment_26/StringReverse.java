package shreya_assignment_26;

public class StringReverse {
	String reverseString(String input) {
		String output="";
		for(int index=input.length()-1;index>=0;index--) {
			output+=input.charAt(index);
		}
		return output;
	}
	public static void main(String[] args) {
		StringReverse stringReverse=new StringReverse();
		String str=stringReverse.reverseString("This is technocredits");
		System.out.println("Output: "+str);

	}

}
