/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i
Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/
package sagar_Anasane;

public class Assignment24 {
	void countNoOfVowelsInUserDefinedString(String str) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			char temp =str.charAt(index);
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u') {
				count++;
			}
		}
		System.out.println("Count of Vowels: "+count);
	}
	
	void maxRepeatingWordWithitsFrequency(String arr) {
		int count=0;
		int max=0;
		String word="";
		String[] str= arr.split(" ");
		for(int index=0;index<str.length;index++) {
			count=0;
			for(int nIndex=0;nIndex<str.length;nIndex++) {
				if(str[index].equals(str[nIndex])) {
					count++;
				}
				if(max<count) {
					word=str[index];
					max=count;
				}
			}
		}
		System.out.println("Max Repeated Word "+word+" and Count of Repeated Word "+max);
	}
	public static void main(String[] args) {
		String input = "technocredits";
		String arr = "Hi Hello Hi Techno Hello Hi";
		Assignment24 assignment24=new Assignment24();
		//System.out.println("Vowels are :");
		assignment24.countNoOfVowelsInUserDefinedString(input);
		assignment24.maxRepeatingWordWithitsFrequency(arr);
	}
}
