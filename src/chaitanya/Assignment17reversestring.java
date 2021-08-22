//Assignment - 17 : 18th Aug'2021
//Write a method which takes one String parameter and return a reverse String.

//Hint : String getReverseString(String input){

//return output;
//}

//input : technocredits
//output : stiderconhcet

package chaitanya;

public class Assignment17reversestring {
	
	void getReverseString(String input) { 
		for(int i = input.length()-1 ; i >=0 ; i--) {
			System.out.print(input.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17reversestring assignment17reversestring = new Assignment17reversestring();
		System.out.print("String after Reversing the Given String : ");
		assignment17reversestring.getReverseString("Chaitanya Reddy");
	}
}
