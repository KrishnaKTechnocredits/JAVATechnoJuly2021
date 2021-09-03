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

package chandani_Assignment_26;

public class Assignment26a{

	String getReverseString(String input){
		String output = "";
		for (int index = input.length()-1;index >= 0; index--){
			 output = output + input.charAt(index); 
		}
			return output;
	}
	
	public static void main (String[] args){
		Assignment26a assignment26a = new Assignment26a();
		String input = "This is Technocredits";
		String output = assignment26a.getReverseString(input);
		  System.out.println("Reverse of given string is : " + output);
	}	
}
