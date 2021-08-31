/* Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i  */


package arti_K.Assignment_24;

public class FindVowels {
	
	void countVowels(String str) {
		int totalCount = 0;
		String vowels = "";
		
		for(int index=0 ; index < str.length(); index++)
		{
			if(index == str.indexOf(str.charAt(index)))
				
				switch(str.charAt(index))
				{
					case 'a':
					case 'A':	
						{
							vowels += str.charAt(index)+" ";
							totalCount++;
							break;
						}
					case 'e':
					case 'E':	
						{
							vowels += str.charAt(index)+" ";
							totalCount++;
							break;
						}
					case 'i':
					case 'I':	
						{
							vowels += str.charAt(index)+" ";
							totalCount++;
							break;
						}
					case 'o':
					case 'O':	
						{
							vowels += str.charAt(index)+" ";
							totalCount++;
							break;
						}
					case 'u':
					case 'U':	
						{
							vowels += str.charAt(index)+" ";
							totalCount++;
							break;
						}
				}
	
			}
		System.out.println("Vowels in given string are : " +vowels);
		System.out.println("Count of Vowels in given string is : " +totalCount);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		FindVowels find = new FindVowels();
		find.countVowels(input);
	}
}
