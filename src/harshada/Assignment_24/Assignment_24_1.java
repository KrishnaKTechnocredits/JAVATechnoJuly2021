/* Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/

package harshada.Assignment_24;

public class Assignment_24_1 {

	void countVowelsInString(String inputStr) {
		int count=0;
		String tempStr="";
		
		for(int index=0; index<inputStr.length(); index++ ) {
			Character ch=inputStr.charAt(index);
			if(index == inputStr.indexOf(ch)) {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
				count++;
				tempStr=tempStr+ch+" ";
				//System.out.print("\t"+ch);
				}
			}
		}
		System.out.println("\nTotal non repeated Vowels in the String are : "+ count);
		System.out.println("Vowels in String '"+ inputStr + "' are : "+ tempStr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_24_1 assignment_24_1=new Assignment_24_1();
		assignment_24_1.countVowelsInString("technocredits");
	}

}
