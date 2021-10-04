package chirag.assignment40;

/*Assignment-40 : 26th Sep'2021
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/

public class FindNumberFromString {
	
	void getNumberFromString(String input) {
		String [] str=input.split(" ");
		for(int index = 0; index < str.length;index++) {
			try {
			int num = Integer.parseInt(str[index]);
			System.out.println("Number from String :"+num);
			}
			catch(NumberFormatException ne) {
				
			}
		}
	}
	void getDecimalNumberFromString(String input) {
		 String [] str = input.split(" ");
		 for(int index=0;index < str.length;index++) {
			 try {
				 Double num= Double.parseDouble(str[index]);
				 System.out.println("Decimal numbers from string : "+num);
			 }
			 catch(NumberFormatException ne) {
				 
			 }
		 }
	}
	public static void main(String[] args) {
		FindNumberFromString findNumberFromString=new FindNumberFromString();
		String str =  "I have 5 years and 3 months of exp";
		findNumberFromString.getNumberFromString(str);
		
		String str1 = "I have 1.1 years and 2.2 months of exp";
		findNumberFromString.getDecimalNumberFromString(str1);
	}
}