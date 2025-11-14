package avinash.assignment40;


/*Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
public class Assignment_40 {
	void getNumbers(String str) {
		String[] input = str.split(" ");
		int temp;
		for(int index=0; index<input.length; index++) {
			try {
				temp = Integer.parseInt(input[index]);
				System.out.println(temp);
			}catch(NumberFormatException ne) {
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_40 assignment_40 = new Assignment_40();
		String str = "I have 5 years and 3 months of exp";
		System.out.println("Output of String = I have 5 years and 3 months of exp");
		assignment_40.getNumbers(str);
		str = "I have 15 years and 9 months of exp";
		System.out.println("Output of String = I have 15 years and 9 months of exp");
		assignment_40.getNumbers(str);
	}

}
