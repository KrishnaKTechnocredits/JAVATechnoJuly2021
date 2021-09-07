package aniket;

public class Assignment_24_1 {
	int count=0;
	String getVowels(String input){
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output=output+ch +"";
				count++;
			}
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				output+=ch+"";
				count++;
			}
		}
		System.out.println("Total count of Vowels is :"+count);
		return output;
		
	}
	public static void main(String[] args) {
		String input="technocrEdits";
		System.out.println("Vowels in String is: "+new Assignment_24_1().getVowels(input));
	}
}


/*void countVowels(String str) {
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
	Assignment_24_1 find = new Assignment_24_1();
	find.countVowels(input);
}*/

