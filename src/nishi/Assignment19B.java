package nishi;

import java.util.Scanner;

public class Assignment19B {
	
	String findMaximumWord(String input)
	{
		String[] output = input.split(" ");
		String max=output[0];
		for(int i=0;i<output.length;i++)
		{
			if(output[i].length()>max.length())
			{
				max=output[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment19B assignment19b=new Assignment19B();
		System.out.println("input = ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Maximum length string is :"+assignment19b.findMaximumWord(input));
		

	}

}
