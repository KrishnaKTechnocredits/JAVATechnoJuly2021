/*Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
package nishi;

public class Assignment40 {
	
	void printNumbers (String input)
	{
		String[] str=input.split(" ");		
		for(int i=0;i<str.length;i++)
		{
			try {
			System.out.println(Integer.parseInt(str[i]));
			}
			catch(Exception e)
			{
				
			}
		}		
	}
	
	public static void main(String[] args) {
		String input="i have 5 years and 3 months of exp";
		new Assignment40().printNumbers(input);
	}
}
