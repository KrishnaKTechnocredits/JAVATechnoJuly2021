package somnath;
import java.util.Scanner;

public class Assignment20_Program2 {

	void printFrequencyOfEachCharacter(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(i==input.indexOf(input.charAt(i)))
			{
				count=new Assignment20_Program1().findFrequencyOfCharacter(input, input.charAt(i));
				System.out.println(input.charAt(i)+"->:"+count);
			}		

		}
	}

	public static void main(String[] args) {
		System.out.println("-------------------------");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String input ");
		String input = scan.next();
		new Assignment20_Program2().printFrequencyOfEachCharacter(input);
		scan.close();
		System.out.println("-------------------------");

	}

}