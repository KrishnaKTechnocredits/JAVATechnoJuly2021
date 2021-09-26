package devendra_SurprizeTest;

public class CodingTest6_10Sept {
	/*Non-Repeating Character*/
	void firstNonRepeatChar(String input1) {
		for(int index = 0; index < input1.length(); index++){
			if(index == input1.lastIndexOf(input1.charAt(index))) {
				System.out.println("First Non Repeating Character : " + input1.charAt(index));
				break;
			}
		}
	}
	
	/*Non-Repeating Word*/
	void firstNonRepeatWord(String input2) {
		String output[] = input2.split(" ");
		for (int index = 0; index < output.length; index++) {
			if (input2.indexOf(output[index]) == input2.lastIndexOf(output[index])) {
				System.out.println("First Non Repeating Word : " + output[index]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		String input1 = "technocredits";
		System.out.println("Input Word String = "+input1);
		CodingTest6_10Sept obj = new CodingTest6_10Sept();
		obj.firstNonRepeatChar(input1);
		
		System.out.println("-----------------------------");
		
		String input2 = "hi this is techno gm credits this hi is";
		System.out.println("Input Sentence String = "+input2);
		obj.firstNonRepeatWord(input2);
	}
}
