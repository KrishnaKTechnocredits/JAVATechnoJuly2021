/*Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/

package vivek;

public class Assignment40 {

	void getNumbersFromString(String[] str) {
		int temp = 0;
		for (int index = 0; index < str.length; index++) {
			try {
				temp = Integer.parseInt(str[index]);
				System.out.println(temp);
			} catch (NumberFormatException fe) {
			}
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		String str = "I have 15 years and 3 months of exp";
		String[] input = str.split(" ");
		assignment40.getNumbersFromString(input);
	}
}
