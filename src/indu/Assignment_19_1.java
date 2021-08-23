package indu;

public class Assignment_19_1 
{
	/*int findWordsInaStatement(String input)
	{								//This logic is just for single space
		String[] str =input.split(" ");
		return str.length;
	}*/
	
	int findWordsInaStatement(String input)
	{
		String [] str = input.split("[^a-zA-Z]+"); // logic for all "^" is non alphanumeric and "+" is for multiple times
		return str.length;
	}
	
	public static void main(String[] ard)
	{
		Assignment_19_1  assignment_19_1 = new Assignment_19_1();
		String input = "Hi    How @@@@@ are   You ****&& Krisha";
		System.out.println("\nThe count of words in String '"+ input +"' : "+assignment_19_1.findWordsInaStatement(input));			
	}
}
