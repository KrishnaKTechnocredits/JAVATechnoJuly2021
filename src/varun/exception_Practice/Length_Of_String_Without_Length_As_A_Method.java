package varun.exception_Practice;

public class Length_Of_String_Without_Length_As_A_Method {
	void calcualteLength(String str) {
		int count =0;
		while(true) {
			try{
				str.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println("Length of given string is " +count);
	}
	
	public static void main(String[] args) {
		String input= "technocredits";
		Length_Of_String_Without_Length_As_A_Method lnthS = new Length_Of_String_Without_Length_As_A_Method();
		lnthS.calcualteLength(input);
	}
}
