package chandni_bhoj_Assignment_20;

public class Program_2 {
	
	void getFrequencyOfChar (String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
			count++;
		}
		System.out.println ("Frequency of " + ch + " is " + count);
	} 
	
	void getFrequencyOfAllChar (String input2) {
		for (int index = 0; index < input2.length(); index++) {
			if (input2.indexOf(input2.charAt(index)) == index)
			getFrequencyOfChar(input2, input2.charAt(index));
			
		}
	}
	
	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		program_2.getFrequencyOfAllChar("hello");
	
		
	}


}
