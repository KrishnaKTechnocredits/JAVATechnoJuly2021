package indrani;

public class Assignment_25 {
	
	void rearrangement(String input) {
		String upperCase = "";
		String lowerCase = "";
		String digit="";
		
		for (int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCase= upperCase+ch;
			}else if (Character.isLowerCase(ch)) {
				lowerCase= lowerCase+ch;
			}else if (Character.isDigit(ch)) {
				digit= digit+Character.getNumericValue(ch);
			}
		}
		System.out.println("Rearranging as upper case - digits - lower case : " + upperCase+digit+lowerCase);
		
	}
	void sumOfDigits(String str) {
		String str1= "";
	    int sum=0;
		for(int index=0; index<str.length();index++){
			char ch =str.charAt(index);
			if (Character.isDigit (ch)){
				str1 += ch;
			}else { 
				if (str1!= "") 
				sum += Integer.parseInt(str1);
				str1 ="";
			}
		}
		System.out.println("Sum of digits in the String is as follows : " + sum);
	}
		public static void main(String[] args) {
			Assignment_25 rearrangesum = new Assignment_25();
			rearrangesum.rearrangement("Ma1U2liK");
			rearrangesum.sumOfDigits("te12ch33no3credit4s");
		}
	}
