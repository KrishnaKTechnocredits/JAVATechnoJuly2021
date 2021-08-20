/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4*/
package monika;

public class Assignment19_Program_1 {

	int countNofWordsInString(String str) {
		String[] arr = str.split(" ");
		return arr.length; 
	}

	public static void main(String[] args) {
		Assignment19_Program_1 assignment19_Program_1 = new Assignment19_Program_1();
		String str= "Hi Techno Credits Hello";
		int count=assignment19_Program_1.countNofWordsInString(str);
		System.out.println("Total No.of Words in the String '"+str+"'is: " +count);
		
	}
}

