package nishi.Assignment24;

import java.util.Scanner;

public class Assignment24B {
	
	String getMaxRepeatingWordsWithFreq(String input)
	{		
		int maxcount=0;
		int count=0;
		String max=" ";
		String[] str=input.split(" ");
		for(int i=0;i<str.length;i++)
		{
			 count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;					
				}
				if(maxcount<count)
				{
					maxcount=count;	
					max=str[j];
				}
			}	
			
		}
		return max+"->"+maxcount;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter word ");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		System.out.println("Output : "+new Assignment24B().getMaxRepeatingWordsWithFreq(word));
		sc.close();
	}
	
}
