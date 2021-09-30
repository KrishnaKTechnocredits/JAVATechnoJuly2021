package gauravk.Assignment_40;
/*
 * Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */

public class ExtractingNumbersFromStringV2 {
	
	void extraction(String s1) {
		
		for(int i=0; i<s1.length(); i++) {
			String t="";
			if(Character.isDigit(s1.charAt(i))) {
				t += s1.charAt(i);
				System.out.print(Integer.parseInt(t));
			}
			else if(i>0 && Character.isDigit(s1.charAt(i-1))) {
				System.out.println("");
			}
		}
	}
		
	public static void main(String[] args) {
		String str = "I have 15 years and 9 months of experience.";
		ExtractingNumbersFromStringV2 extractNums = new ExtractingNumbersFromStringV2();
		extractNums.extraction(str);
	}
}