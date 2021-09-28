package swati.Assignment40;

/*
 * Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */

public class Assignment40 {
	
	void findDigits(String input) {
			int num=0;
			System.out.println(input+" : ");
			String[] temp=input.split(" ");
			for(int index=0;index<temp.length;index++) {
				try {
				num=Integer.parseInt(temp[index]);
				System.out.println(num);
			}catch(NumberFormatException ne) {
				
			}				
		}	
			//System.out.println("\n");
	}

	public static void main(String[] a) {
		Assignment40 a1=new Assignment40();
		a1.findDigits("I have 5 years and 3 months of exp");
		a1.findDigits("I have 15 years and 9 months of exp");
	}
}