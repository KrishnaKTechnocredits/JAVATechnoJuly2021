/*Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/

package sagar_Anasane;

public class Assignment17 {	
	String getReverseString(String input){
		String output = "";
		int length = input.length();
		
		for (int index = length-1;index>=0;index--) {
			output = output + input.charAt(index);
		}
		
		System.out.println("Reverse String :"+ output);
		return output;
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.getReverseString("Technocredits");
	}
}
