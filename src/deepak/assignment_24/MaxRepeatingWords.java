/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
package deepak.assignment_24;

public class MaxRepeatingWords {

	void maxRepeatWords(String str) {

		String[] str1 = str.split(" ");
		int maxCnt = 0;
		String maxWord = "";
		for (int i = 0; i < str1.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].equals(str1[j])) {
					cnt++;
				}
				if (cnt > maxCnt) {
					maxCnt = cnt;
					maxWord = str1[j];
				}
			}
		}displayOutput(maxWord, maxCnt);
	}
	
	void displayOutput(String maxWord, int maxCnt) {
		System.out.println("The Frequency of Word "+"'"+maxWord+"'"+" is "+maxCnt+ " times.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxRepeatingWords obj = new MaxRepeatingWords();
		obj.maxRepeatWords("Hi Hello Hi Techno Hello Hi");
	}

}
