package varun.varun_string_assignment;

public class Scoding_Test_6_2 {

	void findFirstUniqueWord(String str) {
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
				if(str.indexOf(input[index]) == str.lastIndexOf(input[index])) {
					System.out.println("First Unique word from the given string is:- " +input[index]);
					break;
				}
					
					
		}
	}

	public static void main(String[] args) {
		String input = "hi this is techno gm credits this hi is";
		Scoding_Test_6_2 scoding_Test_6_2 = new Scoding_Test_6_2();
		scoding_Test_6_2.findFirstUniqueWord(input);
	}
}
