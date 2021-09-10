package aniket;

import java.util.Arrays;

public class CodingTest_6_2 {
	String getFirstNonRepeatingWord(String s)
	{
		String[] input=s.split(" ");
		System.out.println("First Repeating word in Array "+Arrays.toString(input));
		String str="";
		int cnt=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i].equals(input[j]))
				{		
					cnt++;					
				}
			}
			if(cnt==0)
			{
				str=input[i];
				break;
			}
			else
			{
				cnt=0;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String s="hi this is techno gm credits this hi is";
		System.out.println("Output : "+new CodingTest_6_2().getFirstNonRepeatingWord(s));
	}
}
