package somnath;
import java.util.Scanner;

public class Assignment20_Program3 {

	void printUniqueCharacter(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			if(i==input.indexOf(input.charAt(i)))
			{
				 count=new Assignment20_Program1().findFrequencyOfCharacter(input, input.charAt(i));
			}			
			if(count==1)
			{
				System.out.println(input.charAt(i));
			}
		}
	}	

	public static void main(String[] args) {
		System.out.println("-------------------------");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String input ");
		String input = scan.next();
		new Assignment20_Program3().printUniqueCharacter(input);
		scan.close();
		System.out.println("-------------------------");

	}

}