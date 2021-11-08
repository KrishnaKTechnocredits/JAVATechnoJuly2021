/* Assignment 15 : 16th Aug'2021
program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}
Hint : charAt method of String class helps to retrieve character on given index
*/

package tarangAssignment15;

public class Assignment_15_Program_2  {

	void findMiddleChar(String[] str) {
		char ch1, ch2;
		for(int index=0; index<str.length; index++) {
			if(str[index].length()%2==0) {
				ch1 = str[index].charAt(str[index].length()/2-1);
				System.out.println("Middle character in " + str[index] + " is " + ch1);
			}
			else {
				ch2 = str[index].charAt(str[index].length()/2);
				System.out.println("Middle character in " + str[index] + " is " + ch2);
			}		
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"hello","techno","credits"};
		Assignment_15_Program_2 assignment_15_program_2 = new Assignment_15_Program_2();
		assignment_15_program_2.findMiddleChar(str);
	}
}
