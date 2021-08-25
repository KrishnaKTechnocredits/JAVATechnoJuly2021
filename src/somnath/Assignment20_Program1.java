package somnath;
import java.util.Scanner;

public class Assignment20_Program1 {
	int findFrequencyOfCharacter(String input,char c)
	{	
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c)
			{
				count++;
			}			
		}		
		return count;
	}


	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("Enter String :");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Enter Character");
		char c=sc.next().charAt(0);
		int count=new Assignment20_Program1().findFrequencyOfCharacter(input,c);
		System.out.println(c+"->:"+count);
		sc.close();
		System.out.println("-------------------------");


	}
}