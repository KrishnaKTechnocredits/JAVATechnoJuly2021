/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3
*/
package bhaktiAssignment_24;

public class Assignment_24 {
	//Program 1: Java Program to Count the Number of Vowels in user defined string.
	void countVowel(String input) {
		input = input.toLowerCase();
		String vowels="";
		
		for (int index =0; index< input.length(); index++) {
			char ch= input.charAt(index);
			if(index == input.indexOf(ch)) {
				
			    if(ch=='a' || ch == 'e' || ch== 'i' || ch=='o' || ch == 'u') 	    
			    	vowels+=ch +" ";
			   		    	
			}
		}
		System.out.println("Vowels are --> ");
		System.out.println(vowels);
	}
	//Program 2.1 : COunt provided word in provided strings 
	
	int countWords(String[] srtArray, String word) {
		  
		  int count=0;
		  
		  for (int index =0; index< srtArray.length; index++) {
			  if (srtArray[index].equals(word))
				  count++;
		  }
		  return count;
	}
	//Program 2  : Max repeating word with its freq.
	void countwordFromString(String input) {
		 input= input.toLowerCase();
		 int maxcount=0;
		 int count=0;
		 String word="";
		 String[] srtArray= input.split(" ");
		 for (int index= 0; index< srtArray.length; index++ ) {
			 count=countWords(srtArray, srtArray[index]);
			 if (maxcount<count) {
				 maxcount =count;
				 word=srtArray[index];
			 }
			 
		 }
		 System.out.println(word+ " -> "+maxcount);
	}	
	
	public static void main (String[] hjhj) {
		Assignment_24 string_24= new Assignment_24();
		String input="Hello Technocredits hi hi  Hello metro hello heelo"; 
		string_24.countVowel(input);
		string_24.countwordFromString(input);
		
	}
}
