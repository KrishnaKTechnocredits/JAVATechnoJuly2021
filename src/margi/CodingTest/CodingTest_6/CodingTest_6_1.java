package margi.CodingTest.CodingTest_6;

public class CodingTest_6_1 {
	
	//first non repeating character
	char getFirstChar(String input) {
		char firstChar = input.charAt(0), temp;
		int count;
		for(int index=0; index<input.length(); index++) {
			temp = input.charAt(index);
			count=0;
			for(int innerIndex=0; innerIndex<input.length(); innerIndex++) {
				if(temp == input.charAt(innerIndex)) 
					count++;
			}
			if(count==1) {
				firstChar = temp;
				break;
			}
		}
		return firstChar;
	}
	public static void main(String[] args) {
		CodingTest_6_1 codingTest_6_1 = new CodingTest_6_1();
		String str = "technocredits";
		System.out.println("First non repeating character: " + codingTest_6_1.getFirstChar(str)); 
	}
}
