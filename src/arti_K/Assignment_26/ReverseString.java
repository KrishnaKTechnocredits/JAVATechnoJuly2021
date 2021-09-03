/*  Assignment - 26 : 1st Sep'2021  Program : 1 

WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT     */

package arti_K.Assignment_26;

public class ReverseString {
	
	String revStringWord(String input) {
		String name ="";
		
		for(int index = input.length()-1; index >= 0; index--) {
			name = name + input.charAt(index);
		}
		return name;
	}
	
	String[] takeString(String input) {
		String[] arr = input.split(" ");
		int count = 0;
		
		for(int index = 0; index < arr.length; index++) {
			arr[count] = revStringWord(arr[index]);
			count++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		ReverseString reversestring = new ReverseString();
		String input = "This is technocredits";
		String[] stringArr = reversestring.takeString(input);
		
		System.out.print("String in Reverse Order : ");
		
		for(int index = stringArr.length-1; index >= 0; index--) {
			System.out.print(stringArr[index] + " ");
		}
	}
}
