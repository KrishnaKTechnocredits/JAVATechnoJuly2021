package ramkrishna;

public class Assingment26a {
	String getReverseString(String input) {
 		String output="";
 		for(int index=input.length()-1;index>=0; index--) 
 			output+=input.charAt(index);
 		return output;
 	}
 	public static void main(String[] args) {
 		Assingment26a assignment26a =new Assingment26a();
 		String reverseString=assignment26a.getReverseString("This is technocredits");
 		System.out.println("Reverse String is: " +reverseString);
 	}
}
