package shreya_assignment_25;

public class UppercaseDigitLowercase {
	void OrderWithinString(String str) {
		String digit="";
		String uppercase="";
		String lowercase="";
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				digit+=str.charAt(index);

			}
			else if(Character.isUpperCase(str.charAt(index))) {
				uppercase+=str.charAt(index);
			}
			else if (Character.isLowerCase(str.charAt(index))){
				lowercase+=str.charAt(index);
			}
		}
		System.out.println("Output: "+uppercase+digit+lowercase);
		
	}
	public static void main(String[] args) {
		UppercaseDigitLowercase uppercaseDigitLowercase=new UppercaseDigitLowercase();
		uppercaseDigitLowercase.OrderWithinString("Ma1U2liK");

	}

}
