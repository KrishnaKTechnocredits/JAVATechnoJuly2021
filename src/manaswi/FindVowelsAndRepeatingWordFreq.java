package manaswi;
public class FindVowelsAndRepeatingWordFreq 
{

	void findVowel(String input) 
	{
		String vowels="";
		for(int index=0;index<input.length();index++)
		{
			if(index == input.indexOf(input.charAt(index))) 
			{
				switch(input.charAt(index)){
					case ('a'):
					case ('A'):
						vowels=vowels+" "+input.charAt(index);
						break;
					case 'e' :
					case 'E' :
						vowels=vowels+" "+input.charAt(index);
						break;
					case 'i' :
					case 'I' :	
						vowels=vowels+" "+input.charAt(index);
						break;
					case 'o' :
					case 'O' :
						vowels=vowels+" "+input.charAt(index);
						break;
					case 'u' :
					case 'U' :
						vowels=vowels+" "+input.charAt(index);
						break;
				}

			}

		}
		System.out.println("Number of Vowels in '"+input+"' :"+vowels);
	}

	void findRepeatingWordFreq(String inputStr)
	{
		String[] strArray=inputStr.split(" ");
		int count=0;
		String maxString="";
		int maxCount=0;

	for(int index=0;index<strArray.length;index++)
	{
		count=0;
		for(int j=0;j<strArray.length;j++)
		{
			if(strArray[index].equals(strArray[j]))
			{
				count++;
			}

			if(maxCount<count) 
			{
				maxCount=count;
				maxString=strArray[index];
			}

		}

	}
		System.out.println("\nMax repeating word with its freq.:\n"+maxString+" "+maxCount);
	}
	public static void main(String[] a) 
	{
		FindVowelsAndRepeatingWordFreq vowelsMaxWord=new FindVowelsAndRepeatingWordFreq();
		vowelsMaxWord.findVowel("technocredits");
		vowelsMaxWord.findVowel("TECHNOCREDITS");
		vowelsMaxWord.findRepeatingWordFreq("Hi Hello Hi Techno Hello Hi");
	}
}