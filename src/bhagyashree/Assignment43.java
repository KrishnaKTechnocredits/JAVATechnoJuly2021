package bhagyashree;

public class Assignment43 {
	
	void getCountOfWordsInString(String input)
	{
		int count=0;
		for(int index=0;index<input.length();index++)
		{
			try
			{
				input.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException e)
			{
				break;
			}
		}
		System.out.println("Count of words in a given string is: "+count);
	}
	
	public static void main(String[] args)
	{
		Assignment43 ass43=new Assignment43();
		ass43.getCountOfWordsInString("bhagyashreeyeole");
	}

}
