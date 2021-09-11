package rushikesh.codetests;

public class CodingTest6_2 {
	
	void findFirstUniqueWord(String str) {
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
				if(str.indexOf(input[index]) == str.lastIndexOf(input[index])) {
					System.out.println("First Unique word from the given string is " +input[index]);
					break;
				}
		}
	}

	public static void main(String[] args) {	
		CodingTest6_2 codingTest6_2 = new CodingTest6_2();
		String input = "hi this is techno gm credits this hi is";
		codingTest6_2.findFirstUniqueWord(input);
	}

}
