package nishi;

public class Interview1 {
	
	//String i/p = "Harsh"
	//String output="Hars"
	
	public String getWord(String input)
	{		
		String s="";	
		for(int i=0;i<input.length();i++)
		{
			char uniqueChar=input.charAt(i);
			
			if(i==input.indexOf(uniqueChar))
			{
				s+=uniqueChar;
			}
			
		}
		return s;
	}
	
	public static void main(String[] args) {
		String input="harsh";
		System.out.println("output :"+new Interview1().getWord(input));
		
	}

}
