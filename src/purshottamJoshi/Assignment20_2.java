package purshottamJoshi;

class Assignment20_2{
	
	int getCharCount(String input, char ch) {
		int count=0;
		
		for(int index=0; index < input.length();index++) {
			if(input.charAt(index) == ch) {
			count++;
			}
		}
		System.out.println(ch+":"+count);
		return count;
	}
	
	void printFreqOfEachChar(String input) {
				 
		for(int index=0; index <input.length();index++) {
			if(index == input.indexOf(input.charAt(index)))
				getCharCount(input, input.charAt(index));
		}
		
	}
	
	public static void main(String[] args) {
		Assignment20_2 assignment20_2 = new Assignment20_2();
		assignment20_2.printFreqOfEachChar("purushottam");
		
		
	}
}