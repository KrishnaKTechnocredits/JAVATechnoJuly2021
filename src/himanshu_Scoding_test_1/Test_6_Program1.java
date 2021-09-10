package himanshu_Scoding_test_1;

public class Test_6_Program1 {

	void findNonRepeatingCharacter(String input) {
		
		for(int index=0; index<input.length(); index++){
			if(index == input.lastIndexOf(input.charAt(index))) {
				System.out.println("First Non Repeating Character is : " + input.charAt(index));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		String input = "technocredits";
		
		Test_6_Program1 ex = new Test_6_Program1();
		ex.findNonRepeatingCharacter(input);
		
	}
}
