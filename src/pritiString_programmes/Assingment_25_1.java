package pritiString_programmes;

public class Assingment_25_1 {
	String rearrangeString(String str) {
		String upperCase = "";
		String lowerCase = "";
		String digit="";
		for (int index=0;index<str.length();index++) {
			char ch= str.charAt(index);
			if (Character.isUpperCase(str.charAt(index))) {
				upperCase= upperCase+ch;
			}else if (Character.isLowerCase(str.charAt(index))) {
				lowerCase= lowerCase+ch;
			}else if (Character.isDigit(str.charAt(index))) {
				digit= digit+Character.getNumericValue(ch);
			}	
		}		
			return upperCase+digit+lowerCase;
	}
	
	public static void main(String[] a) {
		Assingment_25_1 assingment_25_1 = new Assingment_25_1();
		String str = "Ma1U2liK";
		System.out.println("Output string  is : "+assingment_25_1.rearrangeString(str));
	}
}
/*String str = "Ma1U2liK"
output : MUK12ali
use is uppercae and is lower case method and getnumericvalue and charAt();
*/

