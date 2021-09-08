package pritiString_programmes;

public class Assingment_25_2 {
	String str= "";
	int NumberSum= 0;
	int sumofdigitsinString(String inputString) {
		for(int index=0; index<inputString.length();index++){
			char ch =inputString.charAt(index);
			if (Character.isDigit (ch)){
				str += ch;
			}else { 
				if (str!= "") 
				NumberSum += Integer.parseInt(str);
				str ="";
			}
		}return NumberSum;
		
	}
	
	public static void main(String[] a) {
		Assingment_25_2 assingment_25_2 = new Assingment_25_2();
		String str = "te12ch33no3credit4s"; 
		System.out.println("Sum of numers in a a givem string is :" + assingment_25_2.sumofdigitsinString(str));
	}
	
}
/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4*/

