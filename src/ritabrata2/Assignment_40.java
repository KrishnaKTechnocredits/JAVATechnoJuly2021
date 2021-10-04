/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/


package ritabrata2;

public class Assignment_40 {
	void handleException(String input) {
		System.out.println("The input string is: "+input);
		String[] str= input.split(" ");
		System.out.println("The output is: ");
		for(int i=0;i<str.length;i++) {
			try {
				int num=Integer.parseInt(str[i]);
				System.out.print(num+" ");
			}
			catch(NumberFormatException e) {
				
			}
		}
	}

	public static void main(String[] args) {
		Assignment_40 excep = new Assignment_40();
		String str = "I have 5 years and 3 months of exp";
		String str1 = "I have 15 years and 9 months of exp";
		excep.handleException(str);
		System.out.println("\n------------------------------------------");
		excep.handleException(str1);

	}

}
