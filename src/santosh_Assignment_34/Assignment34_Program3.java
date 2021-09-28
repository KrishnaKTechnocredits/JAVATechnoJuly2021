/*program 3 : find first non repeating vowel character from given string.
input : santosh
output : a*/
package santosh_Assignment_34;
public class Assignment34_Program3 {
void nonpepeatingVowel(String str) {
		for (int i=0; i< str.length(); i++) {
			char ch= str.charAt(i);
			if (ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u') {
				if(str.indexOf(ch)==str.lastIndexOf(ch)) {
					System.out.println("First Non Repeating Character is =" + ch);
					break;
				}		
			}						

		}
	}
    public static void main(String[] args) {
	Assignment34_Program3  nonreptvowel= new Assignment34_Program3();
	   System.out.println("-----------................-----------------");
	   nonreptvowel.nonpepeatingVowel("santosh");
	   System.out.println("-----------................-----------------");
    }
} 
	