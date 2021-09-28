package gauravk.Assignment_40;
/*
 * Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */
public class ExtractingNumbersFromStringV3 {
	
	void extraction(String s1) {
		String[] sR = s1.split(" ");
		for(int i=0; i<sR.length; i++) {
			try{
				int x = Integer.parseInt(sR[i]);
				System.out.println(x);
			} catch(NumberFormatException ne){
				
			}
		}		
	}
	
	public static void main(String[] args) {
		String str = "I have 15 years and 9 months of experience.";
		ExtractingNumbersFromStringV3 extractNums = new ExtractingNumbersFromStringV3();
		extractNums.extraction(str);
	}
}