package chirag.codingTest;

public class NewString {
	
	String getNewString(String input){
		String newString = "";
		for(int index=0 ; index < input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				newString=newString + Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				newString = newString + Character.toUpperCase(ch);
			}
			else if(Character.isDigit(ch)) {
				newString= newString + ch;
			}
		}

		return newString;
}
	
	public static void main(String[] args) {
		NewString newString = new NewString();
		
		String output = "A1ashVi6";
		System.out.println("Given String : "+output);
		System.out.println("New String : "+newString.getNewString(output));
	}
}