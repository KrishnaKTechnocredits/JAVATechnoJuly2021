package purshottamJoshi;

class Assignment26_1{
	String output = "";
	void reverseString(String input){
		for(int index=input.length()-1; index >= 0; index--) {
			char ch = input.charAt(index);
			output += ch;
		}
		System.out.println(output);
	}
	public static void main(String[] args){
		String str = "This is Purshottam";
		Assignment26_1 assignment26_1 = new Assignment26_1();
		assignment26_1.reverseString(str);
	}
}
