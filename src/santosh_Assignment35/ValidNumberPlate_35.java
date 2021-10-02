
/* Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid

*/
package santosh_Assignment35;

public class ValidNumberPlate_35 {

	void displayValidInvalidNumberPlate(String str)
	{
		boolean flag= true;
		if(str.length()==13)
		{
			if(str.charAt(2)==' ' && str.charAt(5)==' ' && str.charAt(8)==' ')
			{
				if(isValidChar(str))
					flag=true;
				else
					flag=false;
			}

			else if(str.charAt(2)=='-' && str.charAt(5)==' ' && str.charAt(8)==' ')
			{
				if(isValidChar(str))
					flag=true;
				else
					flag=false;
			}
			else
				flag=false;

		}
		else 
		{
			flag=false;
		}

		if(flag)
			System.out.println(str+" is Valid");
		else
			System.out.println(str+" is InValid");
	}

	 boolean isValidChar(String str) {
		boolean flag= false;
		if(Character.isUpperCase(str.charAt(0))&& Character.isUpperCase(str.charAt(1)) &&
				Character.isUpperCase(str.charAt(6))&& Character.isUpperCase(str.charAt(7)) )
		{
			if(Character.isDigit(str.charAt(3))&& Character.isDigit(str.charAt(4)))
			 {
				for(int i=9;i<str.length();i++)
				{
					if(Character.isDigit(str.charAt(i)))
					{
						flag=true;
					}
					else {
						flag=false;
						break;
					}
				}
	   		}

		}

		return flag;

	}

	public static void main(String[] args) {
		ValidNumberPlate_35 assignment35 = new ValidNumberPlate_35();
		String str1="MH 12 BK 4432";
		String str2="MH-12 BK 1432";
		String str3="GJ 05 MK 1123";
		String str4="MHk12-BK 4432";
		System.out.println("---------------------------");
		assignment35.displayValidInvalidNumberPlate(str1);
		System.out.println("---------------------------");
		assignment35.displayValidInvalidNumberPlate(str2);
		System.out.println("---------------------------");
		assignment35.displayValidInvalidNumberPlate(str3);
		System.out.println("---------------------------");
		assignment35.displayValidInvalidNumberPlate(str4);
		System.out.println("---------------------------");
	}
}
