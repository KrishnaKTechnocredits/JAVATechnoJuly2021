package purshottamJoshi;

class Programming_Test2{
	
	void upperLower(String input){
		String output="";
		for(int index=0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch)){
				output += Character.toUpperCase(ch);
			}
			if(Character.isUpperCase(ch)){
				output += Character.toLowerCase(ch);
			}
			if(Character.isDigit(ch)){
				output += ch;
			}
		}
		
		System.out.println(output);
	}
	
	public static void main(String[] args){
		String str = "A1ashVi6";
		Programming_Test2 programming_test2 = new Programming_Test2();
		programming_test2.upperLower(str);
	}
}