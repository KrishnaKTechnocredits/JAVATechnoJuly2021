/*Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
package shalaka.codingexam1;

public class Shalaka_Codingtest6_Prog2 {
	void getNonRepeatingWord(String str) {
		String input[] = str.split(" ");
		for (int index = 0; index < input.length; index++) {
			if (str.indexOf(input[index]) == str.lastIndexOf(input[index])) {
				System.out.println("First non repeating word from a given String is: " + input[index]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hi this is techno gm credits this hi is ";
		Shalaka_Codingtest6_Prog2 shalaka_Codingtest6_Prog2 = new Shalaka_Codingtest6_Prog2();
		shalaka_Codingtest6_Prog2.getNonRepeatingWord(input);
	}

}
