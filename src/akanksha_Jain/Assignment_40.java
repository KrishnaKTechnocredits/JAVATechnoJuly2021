/* Assignment-40 : 26th Sep'2021
Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15  3 */

package akanksha_Jain;

public class Assignment_40 {
	
	void handlingException(String str) {
		String[] input = str.split(" ");
		int num = 0;
		int count = 0;
		System.out.print("The digits in a string '" + str + "' is- ");
		for(int index=0; index<input.length; index++) {
			try {
				num = Integer.parseInt(input[index]);
				if(num>9)
					count += 2;
				else
					count++;
				System.out.print(num + " ");
			} catch(NumberFormatException ne) {
						
			}
		}
		System.out.println("\nThe count of numbers in a string is " + count);
	}
	
	public static void main(String[] args) {
		String str = "I have 5 years and 3 months of exp";
		String str1 = "I have 15 years and 9 months of exp";
		Assignment_40 assignment_40 = new Assignment_40();
		assignment_40.handlingException(str);
		assignment_40.handlingException(str1);
	}
}