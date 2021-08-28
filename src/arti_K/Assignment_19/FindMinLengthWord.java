/*program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi
 */

package arti_K.Assignment_19;

public class FindMinLengthWord {

	void findMinLenWord(String str) {
		
		String[] name = str.split(" ");
		String minLenword = name[0];
		
		for(int index = 0; index < name.length; index++) {
			if(name[index].length() < minLenword.length()) 
				minLenword = name[index];
		}
		System.out.println(minLenword+" Word has minimum Length as "+ minLenword.length());
	}
	
	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		
		FindMinLengthWord maxlen = new FindMinLengthWord();
		maxlen.findMinLenWord(input);
	}

}
