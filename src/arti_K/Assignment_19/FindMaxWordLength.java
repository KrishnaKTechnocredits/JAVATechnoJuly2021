/* program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits
*/

package arti_K.Assignment_19;

public class FindMaxWordLength {
	
	void findMaxLenWord(String str) {
		String max = "";
		int maxlen = 0;
		String[] name = str.split(" ");
		
		for(int index = 0; index < name.length; index++) {
			
			if(name[index].length() >= max.length()) {
				max = name[index];
				maxlen = name[index].length();
			}
		}
		System.out.println(max+" Word has maximum Length as "+maxlen);
	}
	
	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		
		FindMaxWordLength maxlen = new FindMaxWordLength();
		maxlen.findMaxLenWord(input);
	}

}
