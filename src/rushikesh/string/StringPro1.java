package rushikesh.string;

public class StringPro1 {
	
	int getCountOfVowel(String input){
		int vowelCount=0;
		for(int index = 0;index<input.length();index++) {		
			char ch=' ';
			ch= input.charAt(index);
			//if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
			if(Character.isLetter(ch))
			{
				switch(ch){
				case 'A':
				case 'a':
				{
					vowelCount++;
					System.out.println(ch+" is a vowel");
					break;
				}
				case 'E':
				case 'e':
				{
					vowelCount++;
					System.out.println(ch+" is a vowel");
					break;
				}
				case 'I':
				case 'i':
				{
					vowelCount++;
					System.out.println(ch+" is a vowel");
					break;
				}
				case 'O':
				case 'o':
				{
					vowelCount++;
					System.out.println(ch+" is a vowel");
					break;
				}
				case 'U':
				case 'u':
				{
					vowelCount++;
					System.out.println(ch+" is a vowel");
					break;
				}
				}
			}
		}
		return vowelCount;
	}
	public static void main(String[] args) {
		StringPro1 stringPro1=new StringPro1();
		String input = "technocredits";
		int vowelCount=stringPro1.getCountOfVowel(input);	
		System.out.println("There are total "+vowelCount+" vowels in given string");
	}

}
