package tarangAssignment40;

/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
public class ExceptionHandling {

	void printDigitsOnly(String input) {
		String[] output = input.split(" ");
		int digit=0;
		System.out.println("Given input string is : " + input);
		for(int index=0;index<output.length;index++) {
			try {
				digit = Integer.parseInt(output[index]);
				System.out.println(digit);
			}catch(NumberFormatException ex) {
				
			}
		}
	}

	// just for practice
	void printDecimal(String input) {
		String[] output = input.split(" ");
		Double digit = 0.0;
		System.out.println("Given input string is : " + input);
		for (int index = 0; index < output.length; index++) {
			try {
				digit = Double.parseDouble(output[index]);
				System.out.println(digit);
			} catch (NumberFormatException ex) {

			}
		}
	}

	public static void main(String[] args) {
		ExceptionHandling e1 = new ExceptionHandling();
		String input = "I have 5 years and 3 months of exp";
		e1.printDigitsOnly(input);

		String input1 = "I have 5.2 years and 3.5 months of exp";
		e1.printDecimal(input1);
	}

}
