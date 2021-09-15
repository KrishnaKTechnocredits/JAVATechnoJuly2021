package arti_G_Assignment_25;
/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/
public class Program25 {

	int getSum(String input) {
		int sum = 0;
		String temp = "0";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				temp += ch;
			}else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum;
	}
	

	String arrangeString(String str){
		String output = "";
		for(int i=0; i <str.length();i++){
			if (Character.isUpperCase(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}

		for(int i=0; i <str.length();i++){
			if (Character.isDigit(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}

		for(int i=0; i <str.length();i++){
			if (Character.isLowerCase(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}
		return output;
	}



	public static void main(String[] args) {
	Program25 program25 = new Program25();
	String input = "te12ch33no3credi4s";
	System.out.println("In String = "+input+" , Sum of Digits = "+program25.getSum(input));

	String str = "Ma1U2liK";
	System.out.println("Output String as per requirement : "+program25.arrangeString(str));	
	}
}
