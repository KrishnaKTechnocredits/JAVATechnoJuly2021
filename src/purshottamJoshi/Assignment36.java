/*Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/
package purshottamJoshi;

class Assignment36{
	
   boolean isVowel(char c) {

        return (c == 'a' || c == 'e' || c == 'i' || c == 'o'  || c == 'u');
    }
    
   String swapVowel(String str1) {
       
	   int j = 0;
       
        char[] ch = str1.toCharArray();
        String vowel = "";
        for (int index = 0; index < ch.length; index++) {
            if (isVowel(ch[index])) {
                j++;
                vowel += ch[index];
            }
        }
        for (int index = 0; index < ch.length; index++) {
            if (isVowel(ch[index])) {
                ch[index] = vowel.charAt(--j);
            }
        }
 
        return String.valueOf(ch);
    }

	public static void main(String[] args){
		String str = "amol";
		String input = "good morning";
		System.out.println(new Assignment36().swapVowel(str));
		System.out.println(new Assignment36().swapVowel(input));
	}
}