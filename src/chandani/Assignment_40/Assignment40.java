/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15 and 9
         5 and 3*/
package chandani.Assignment_40;

public class Assignment40 {
	
	void getNumbersFromTheString(String str) {		
		
		String[] str1 = str.split(" ");
		System.out.println("The Numbers in the string using Try Catch method is : " );
		for(int index = 0; index < str1.length; index++) {
			int Digits  = 0;
			try {
				 Digits = Integer.parseInt(str1[index]);
				System.out.println(Digits);
			}catch(NumberFormatException ne) {
			 }
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		String str1 = "I have 15 years and 9 months of exp";
		assignment40.getNumbersFromTheString(str1);
		String str2 = "I have 5 years and 3 months of exp";
		assignment40.getNumbersFromTheString(str2);	
	}
}
