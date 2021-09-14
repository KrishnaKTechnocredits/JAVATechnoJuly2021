/*Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/

package vivek.ScodingTest.CodingTest6;

public class CodingTest6_2 {

	void findNonRepeatingWord(String[] arr) {
		String word = "";
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			word = arr[index];
			for (int innerindex = 0; innerindex < arr.length; innerindex++) {
				if (arr[innerindex].equals(word))
					cnt++;
			}
			if (cnt == 1) {
				System.out.println(word + " is the first non repeating word");
				break;
			}
			cnt = 0;
		}
	}

	public static void main(String[] args) {
		CodingTest6_2 codingtest6_2 = new CodingTest6_2();
		String str = "hi this is techno gm credits this hi is";
		String[] arr = str.split(" ");
		codingtest6_2.findNonRepeatingWord(arr);
	}
}
