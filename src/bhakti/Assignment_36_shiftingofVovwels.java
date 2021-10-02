/*String str1 = "good morning";  //"giod mornog"
 * 
		String str2 = "amol";// "omal"
		String str3 = "haorseuih"; //hiurseoah
*/
package bhakti;

public class Assignment_36_shiftingofVovwels {
	
	void shiftVovwelsinString(String input) {
		String vowel="";
		for (int i=0; i< input.length(); i++) {
			char ch= input.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				vowel+=ch;			
		}
		String vovwelRev="";
		for (int i=vowel.length()-1; i>=0 ; i--) { 
			vovwelRev+=vowel.charAt(i);
		}
		String output="";
		int x=0;
		for (int i=0; i< input.length(); i++) {
			char ch= input.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				output+=vovwelRev.charAt(x);
				x++;
			}else
				output+=ch;		
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		String str="good morning";
		Assignment_36_shiftingofVovwels a= new Assignment_36_shiftingofVovwels();
		a.shiftVovwelsinString(str);
		a.shiftVovwelsinString("haorseuih");
		a.shiftVovwelsinString("omal");
		a.shiftVovwelsinString("omal Is best person");
	}

}
