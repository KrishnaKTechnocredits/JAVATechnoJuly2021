package astha.Assignment36;

public class SwapVowels {

String getVowels(String str) {
		
		String vowels = "";

		for (int index = str.length() - 1; index >= 0 ;index--) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || 
					str.charAt(index) == 'i' 
				|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				
				vowels += str.charAt(index);
			}
		}

		return vowels;
	}
	
	String swapVowels(String str) {
        int count = 0;
        String output = "";
		for(int index=0; index < str.length(); index++) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || 
					str.charAt(index) == 'i' 
				|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				output = output + getVowels(str).charAt(count);
				count++;			
			}else
				output = output + str.charAt(index);
		}
	        return output;
	}
	
		
	public static void main(String[] args) {
		SwapVowels swapVowels = new SwapVowels();
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("\ninput : " + str1 + " \noutput : "+swapVowels.swapVowels(str1));
		System.out.println("\ninput : " + str2 + " \noutput : " + swapVowels.swapVowels(str2));
		System.out.println("\ninput : " + str3 + " \noutput : " + swapVowels.swapVowels(str3));

	}
}
