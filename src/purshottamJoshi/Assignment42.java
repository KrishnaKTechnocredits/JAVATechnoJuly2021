package purshottamJoshi;

public class Assignment42 {
	
	void removeAllRepeatingChar(String input) {
		String output="";
		for(int index=0; index < input.length(); index++) {
			char ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				output +=input.charAt(index);
				
			}
		}
		System.out.println(output);
	}
	static final void  removeDuplicateChar(String input) {
		String output="";
		for(int index=0; index < input.length(); index++) {
			char ch=input.charAt(index);
			if(input.indexOf(ch) == index) {
				output += input.charAt(index);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		String str="technocredits";
		removeDuplicateChar(str);
		new Assignment42().removeAllRepeatingChar(str);
	}
}
