package chandani.Assignment_34;

public class Assignment34c {
	
	void getFirstNonRepeatingVowel(String input) {
		 
		String str = input;
		 while(str.length() != 0) {
			int str1 = str.length();
			str=str.replace(Character.toString(str.charAt(0)),"");
		 	if(str1-str.length() == 1 && str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' 
		 			|| str.charAt(0)=='o' || str.charAt(0)=='u') {
		 		System.out.println("First non repeating Vowel in given String " + input + " is :" + str.charAt(0));
		 		break;
		 	}
		 }
	 }
	public static void main(String[] args) {
		Assignment34c assignment34c = new Assignment34c();
		String str = "aeapquawrpti";
		assignment34c.getFirstNonRepeatingVowel(str);

	}

}
