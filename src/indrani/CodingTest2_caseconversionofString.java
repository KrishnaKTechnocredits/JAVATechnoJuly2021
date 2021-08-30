package indrani;

public class CodingTest2_caseconversionofString {
	
	void caseConversion(String str) {
		String value="";
		
		for(int index=0;index<str.length();index++) {
			
			char ch=str.charAt(index);
			
			if(Character.isUpperCase(ch))
				ch=Character.toLowerCase(ch);   // conversion from upper case to lower case
			
			else if (Character.isLowerCase(ch))
				ch=Character.toUpperCase(ch);    // conversion from lower case to upper case
			
			value=value+ch;
			
		}
		System.out.println("Case conversion from lower to upper case and vice versa is as : "+value);
	}
		public static void main(String[] args) {
			CodingTest2_caseconversionofString caseconversion = new CodingTest2_caseconversionofString();
			caseconversion.caseConversion("A1ashVi6");
		
	}

}
