package suchita;

  // Test_30 Aug

class Test_30 {

	String getReversecase(String input) {
		
		
		String output = "";
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			
			if (Character.isUpperCase(ch)) {
				output +=  Character.toLowerCase(ch);
				
				
				
				} else if (Character.isLowerCase(ch)) {
				output +=  Character.toUpperCase(ch);
				
				
				} else if (Character.isDigit(ch)) {
				output += ch;
				}
			}
			//System.out.println( "converted to ::" + output);
		
		return output;
			
			
	}
		
		public static void main(String[] args) {
			
			Test_30 test = new Test_30();
			String input = "A1ashVi6";
			String output = test.getReversecase(input);
			
			System.out.println("\n Given String :" + input +"\n New String :: " + output);
		}
}
