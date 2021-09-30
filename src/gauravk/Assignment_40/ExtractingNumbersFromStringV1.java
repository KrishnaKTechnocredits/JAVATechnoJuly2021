package gauravk.Assignment_40;
/*
 * Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */

public class ExtractingNumbersFromStringV1 {
	
	void extraction(String s1) {
		String[] sR = s1.split(" ");
		for(int i=0; i<sR.length; i++) {
			for(int j=0; j<sR[i].length(); j++) {
				if(Character.isDigit(sR[i].charAt(j)))
					System.out.print(Integer.parseInt(Character.toString(sR[i].charAt(j))));
			}
			if(i>0 && !Character.isDigit(sR[i].charAt(0)))
				System.out.println("");
		}		
	}
		
	public static void main(String[] args) {
		String str = "I have 15 years and 9 months of experience.";
		ExtractingNumbersFromStringV1 extractNums = new ExtractingNumbersFromStringV1();
		extractNums.extraction(str);
	}
}