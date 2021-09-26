package rasika;

public class A {
	
	String getString(String str){
		String input = "";
		String output = "";
		for(int index=0;index<str.length();index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				input = ""+str.charAt(index);
				output+= input.toLowerCase();
			}
			else if(Character.isLowerCase(str.charAt(index))) {
				input = ""+str.charAt(index);
				output+= input.toUpperCase();
			}
			else if(Character.isDigit(str.charAt(index))) {
				output += str.charAt(index);
			}
		}
		return output;
		
	}
	public static void main(String[] args) {
	A a = new A();
	System.out.println("String is "+a.getString("A1ashVi6"));
}
}
