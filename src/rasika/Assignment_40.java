package rasika;
/*
Assignment-40 : 26th Sep'2021
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 5 3 and 15 9 */

public class Assignment_40 {

	void getNumbersFromString(String str){
		String[] output = str.split(" ");
		for(int index = 0; index < output.length; index++) {
			try {
				int num = Integer.parseInt(output[index]);
				System.out.print(num+" ");
			}
			catch(NumberFormatException ne) {
				
			}
		}
	}
	public static void main(String[] args) {
		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.getNumbersFromString("I have 15 years and 9 months of exp");
		System.out.println();
		assignment_40.getNumbersFromString("I have 5 years and 3 months of exp");
	}
}
