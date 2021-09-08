package technocredits1.interviewQue;

public class Example1 {

	int getCharCount(String input, char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == ch)
				count++;
		}
		System.out.println("In word " + input + ", freq of " + ch + ":" + count);
		return count;
	}
	
	void printFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			if(index == input.indexOf(input.charAt(index)))
				getCharCount(input, input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.printFreqOfEachChar("technocredits");
		example1.getCharCount("Margi", 'a');
	}
}
