package precilla.codingtest2;

public class StringProgram {

	void convertValue(String string) {
		String output="";
		for(int index=0;index<string.length();index++) {
			char ch=string.charAt(index);
			if(Character.isLetter(ch)&&Character.isUpperCase(ch))
				output+=Character.toLowerCase(ch);
			if(Character.isLetter(ch)&&Character.isLowerCase(ch))
				output+=Character.toUpperCase(ch);
			if(!Character.isLetter(ch))
				output+=String.valueOf(ch);
		}
		System.out.println("Output : " +output);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringProgram stringProgram=new StringProgram();
		String input="A1ashVi6";
		System.out.println("Input : "+input);
		stringProgram.convertValue(input);
	}

}
