package himanshu_Scoding_test_1;

public class Test_6_Program2 {

	void findNonRepeatingStringMtd(String input) {

		String output[] = input.split(" ");

		for (int index = 0; index < output.length; index++) {
			if (input.indexOf(output[index]) == input.lastIndexOf(output[index])) {
				System.out.println("First Non Repeating Word From Given String : " + output[index]);
				break;
			}
		}

	}

	public static void main(String[] args) {

		String input = "hi this is techno gm credits this hi is";

		Test_6_Program2 ex = new Test_6_Program2();
		ex.findNonRepeatingStringMtd(input);
	}
}
