package technocredits1.interviewQue;

public class Example4 {

	int getAsciiValue(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}
	
	char getChar(int asciiValue) {
		char ch = (char)asciiValue;
		return ch;
	}
	
	public static void main(String[] args) {
		/*char ch = '9';
		int temp = ch - 48;
		System.out.println(temp);
		
		char ch1 = '.';
		int temp1 = ch1;
		System.out.println(temp1);*/
		
		Example4 example4 = new Example4();
		
		for(int num = 1; num <=100; num++) {
			char answer = example4.getChar(num);
			System.out.println(num + ":" + answer);
		}
	}
}
