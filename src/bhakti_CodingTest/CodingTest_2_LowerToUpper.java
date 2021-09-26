//Programming Test - 2 : 30th Aug 2021
//
//Convert all lowercase to uppercase and uppercase to lowercase in a given string.
//
//Input : A1ashVi6
//Output : a1ASHvI6

package bhakti_CodingTest;

public class CodingTest_2_LowerToUpper {
	
	void convertString(String input) {
		String output="";	
		for (int index=0; index< input.length(); index++) {
			char ch= input.charAt(index);
			if (!Character.isDigit(ch)) {
				if (Character.isLowerCase(ch)) {					
					ch=Character.toUpperCase(ch);
				}
				else if (Character.isUpperCase(ch)) {
					ch=Character.toLowerCase(ch);
				}
				output+=ch;
				
			}else
				output+=ch;	
			
		}	
		System.out.println(output);	
		
		
	}
	
	public static void main(String[] ytyt) {
		String input="bhakti KAKADE 45";
		CodingTest_2_LowerToUpper codingTest_2_LowerToUpper= new CodingTest_2_LowerToUpper();
		codingTest_2_LowerToUpper.convertString(input);
		
		
	}

}
	
