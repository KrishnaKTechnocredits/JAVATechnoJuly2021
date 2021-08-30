/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */

package monika;

public class Assignment24_PRogram_1 {

	boolean isVowel(char input) {		
		if(input =='a'||input =='e'||input =='i'||input =='o'||input =='u') {	
			return true;
		}
		else
			return false;
	}
	void getNumberOfVowelsInString(String input) {
		int count = 0;
		String str = input.toLowerCase();
		System.out.println("Vowels in the string are: ");
		for(int index = 0; index < str.length(); index++) {
			if(index == str.indexOf(str.charAt(index)))
				if(isVowel(str.charAt(index))) {
					count++;
					System.out.println(str.charAt(index));
				}
		}
		System.out.println("Total Vowels in the '"+str+"' String: "+count);
	}	
	public static void main(String[] args) {
		Assignment24_PRogram_1 assignment24_PRogram_1=new Assignment24_PRogram_1();
		assignment24_PRogram_1.getNumberOfVowelsInString("TechnOcredits");
		
	}
}
