package chandani;

class Assignment15b{

char[] getMidCharOfStringArray(String[] str) {
		
		int midIndex=0;

		char[] output=new char[str.length];
		for( int index=0;index<str.length;index++) {
			if(str[index].length() % 2 == 0) {
				midIndex = str[index].length()/2 - 1;
			}else { 
				midIndex = str[index].length() / 2;
			}
			output[index]=str[index].charAt(midIndex);
		}
		return output;
	}


	public static void main(String[] arg){
		String[] input = { "hello", "techno", "credits" };
		char[] output = new char[input.length];
		Assignment15b assignment15b = new Assignment15b();
		output = assignment15b.getMidCharOfStringArray(input);
		for (int index = 0; index < output.length; index++) 
			System.out.println("Middle Character of string '" + input[index] + "' is " + output[index]);
	}

}