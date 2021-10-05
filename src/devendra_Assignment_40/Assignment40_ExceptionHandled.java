package devendra_Assignment_40;

public class Assignment40_ExceptionHandled {
	void printNumbersFromString(String input) {
		int num = 0;
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			try {
				num = Integer.parseInt(str[index]);
				System.out.println(num);

			} catch (NumberFormatException ne) {
				
			}
		}
	}

	public static void main(String[] args) {
		Assignment40_ExceptionHandled obj = new Assignment40_ExceptionHandled();
		obj.printNumbersFromString("I have 15 years and 3 months of exp");
	}
}

/*
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
*/