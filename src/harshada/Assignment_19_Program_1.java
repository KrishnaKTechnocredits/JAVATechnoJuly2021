/*Assignment - 19 : 20th Aug'2021

program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70

*/
package harshada;

public class Assignment_19_Program_1 {
	
	//Find number of words without using split() method
	void findNumberOfWordsUsingCharAt(String input) {
		int count=0;
		for(int index=0; index< input.length()-1; index++) {
			if(input.charAt(index)==' ' || input.charAt(index)==',' || input.charAt(index)=='.') {// for character use single quotes and for string we use double quotes
				count++;
			}
		}
		System.out.println("String is: "+ input);
		System.out.println("Number of words in the given String are: "+ ++count);
		System.out.println();
	}
	
	void findNumberOfWordsUsingSplit(String input){
		//String tempInput=new String(input.length);
		input=input.replace(',', ' ').replace('.',' ').replace("  "," ").replace('-',' ');		//replace characters by space
		String array[]=input.split(" ");//now split string by space, use double quotes
		// now print array length
		System.out.println("String is: "+ input);
		System.out.println("Number of words in the given string are : "+ array.length);
	}
	
	public static void main(String a[]) {
		Assignment_19_Program_1 assignment_19_P1=new Assignment_19_Program_1();
		String input1="Hi Techno Credits Hello";
		assignment_19_P1.findNumberOfWordsUsingCharAt(input1);
		String input2="State Bank of India is in Mumbai, Maharashtra.";
		assignment_19_P1.findNumberOfWordsUsingSplit(input2);
	}

}
