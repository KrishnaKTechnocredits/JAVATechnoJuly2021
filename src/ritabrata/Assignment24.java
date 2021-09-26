/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/

package ritabrata;

public class Assignment24 {
	
	void findVowel(String input) {
		String vowel="";
		for (int index=0; index<input.length(); index++) {
			char ch= input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				if(index==input.indexOf(ch)) {
					if(vowel!="")
						vowel+=",";
					vowel+=ch +"";
				}
				
			}
			
		}
		System.out.println("The vowels are: "+vowel);
		
	}
	
	void maxRepeatingWord(String input) {
		String[] arr= input.split(" ");
		int count=0;
		String max="";
		for(int index=0; index<input.length(); index++) {
			int individualCount=1;
			for(int j=index+1; j<arr.length; j++) {
				if(arr[j].equals(arr[index])) {
					individualCount++;
				}
			}
			if(count< individualCount) {
				count=individualCount;
				max= arr[index];
			}
			
			
		}
		System.out.println("The maximum repeated word is: "+max+", repeated for: "+count+" times");
		
	}

	public static void main(String[] args) {
		Assignment24 assignment24= new Assignment24();
		assignment24.findVowel("technocredits");
		assignment24.maxRepeatingWord("Hi Hello Hi Techno Hello Hi");
	}

}
