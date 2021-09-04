/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package atul_K.Assignments.Ass24;

public class Program1 {
	
	public static void main (String[] args) {
		Program1 v1 = new Program1();
		v1.getVowelsFromString("Technocredits");
	}

	int getVowelsFromString(String str) {
		int cnt =0;
		System.out.print("Vowels are ");
		for(int index=0;index<str.length();index++) {
			char ch = str.toLowerCase().charAt(index);
			if (str.indexOf(ch)== index) {
				switch (ch) {
					case 'a':
						System.out.print(ch+", ");
						cnt++;
						break;
					case 'e':
						System.out.print(ch+", ");
						cnt++;
						break;
					case 'i':
						System.out.print(ch+", ");
						cnt++;
						break;
					case 'o':
						System.out.print(ch+", ");
						cnt++;
						break;
					case 'u':
						System.out.print(ch+", ");
						cnt++;
						break;
					default :
						break;
				}
			}
		}
		return cnt;
	}
}
