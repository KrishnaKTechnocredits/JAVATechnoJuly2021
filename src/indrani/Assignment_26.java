/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable*/

package indrani;
import java.util.Arrays;

public class Assignment_26 {

	void reverseOfString(String input) {
		String output = "";
		for(int index=input.length()-1; index >=0; index--) {
			output = output + input.charAt(index);
		}
		System.out.println(output); 
	}
	void reverseOfStringArray(String[] input) {
		int temp=0;
		String[] output = new String[input.length];
		for(int index=input.length-1; index>=0; index--) {
			output[temp]=input[index];
			temp++;
		}
		System.out.println(Arrays.toString(output));
}
	void swapUsingThirdVariable(int n1, int n2) {
		int thirdvariable=n1;
		n1=n2;
		n2=thirdvariable;
		System.out.println("Final values after swapping : n1 = " + n1 + " , n2 = " + n2);
	}
	void swapWithoutThirdVariable(int n1, int n2) {
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Final values after swapping : n1 = " + n1 + " , n2 = " + n2);
	}
	public static void main(String[] args) {
		Assignment_26 program1_to_4 = new Assignment_26();
		program1_to_4.reverseOfString("This is technocredits");
		String[] array= {"Credits", "Techno","From","Diwali","Happy"};
		program1_to_4.reverseOfStringArray(array);
		program1_to_4.swapUsingThirdVariable(40,26);
		program1_to_4.swapUsingThirdVariable(40,50);
		
	}
}
