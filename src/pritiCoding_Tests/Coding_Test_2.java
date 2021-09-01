package pritiCoding_Tests;

public class Coding_Test_2 {
	
	void ConverlowToUpAndUpTolow(String str) {
		int upperTemp = 0;
		int lowerTemp = 0;
		String output= "";
		for ( int index=0; index<str.length();index++){
			char ch= str.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperTemp = ch;
				upperTemp = upperTemp + 32;
		        ch = (char) upperTemp;
		        output= output+ch;
			}else if (Character.isLowerCase(ch)) {
		        	lowerTemp = ch;
		        	lowerTemp = lowerTemp - 32;
			        ch = (char) lowerTemp;
			        output= output+ch;
		        } else if(Character.isDigit(ch)) {
				output= output+Character.getNumericValue(ch);
				}
		}
			System.out.println("lowercase to uppercase and uppercase to lowercase in a given string" + " A1ashVi6 :" + output);
	}
					
	public static void main(String[] a) {
		Coding_Test_2 coding_Test_2 = new Coding_Test_2();
		String  Input = "A1ashVi6";
		coding_Test_2.ConverlowToUpAndUpTolow(Input);
	}
}
/*Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/