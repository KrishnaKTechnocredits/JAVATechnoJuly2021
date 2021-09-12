package amol_Pawar.ProgrammingTest_6;

import java.util.Arrays;

public class Program_2 {
	
	void getNonRepeatingWord(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("First non repeating Character is : " + ch);
				break;
			}
		}
	}
	
	void getString(String input)
	{
		String[] str=input.split(" ");
		boolean flag=true;
		for(int index=0;index<str.length;index++)
		{
			
			for( int innerIndex=index+1;innerIndex<str.length;innerIndex++)
			{
				if(str[index].equals(str[innerIndex]) )
				{
					flag=false;
					break;
				}
				else
					flag=true;
			}
			if(flag) {
			System.out.println("First non repitative word: "+str[index]);
			break;
			}
		}
		//System.out.println(Arrays.toString(str));
	}
	public static void main(String[] args) {
		Program_2 Program_2=new Program_2();
		Program_2.getString("hi this is techno gm credits this hi is");
		

	}

}
