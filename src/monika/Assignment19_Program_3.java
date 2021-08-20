/*program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi*/
package monika;

public class Assignment19_Program_3 {

	String findMinimumWordLength(String str) {
		String newString= "";
		String[] arr=str.split(" ");
		int temp=arr[0].length();
		
		for(int index=0; index<arr.length;index++) {
			if(arr[index].length() < temp) {
				temp = arr[index].length();
				newString = arr[index];
			}
		}
		return newString;
	}
	public static void main(String[] args) {
		Assignment19_Program_3 assignment19_Program_3 = new Assignment19_Program_3();
		String str = "good morning technocredits hi hello";
		String minLength = assignment19_Program_3.findMinimumWordLength(str);
		System.out.println("The smallest word in the given string '" + str + "' is '" + minLength
				+ "' and the max length is: " + minLength.length());
	}
}