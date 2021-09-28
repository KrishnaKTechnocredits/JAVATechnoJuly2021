/*
 Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3 */

package indu;

public class FindNumFromstringUsingTryCatch_A40 {
	
	
	void findNumberInString(String str)
	{
		String[] strArr = str.split(" ");
		int num =0;
		System.out.print("\n\nDigits in  String [" +str +"] is : ");
		for(int index=0;index<strArr.length;index++)
		{
			try {
				
				num = Integer.parseInt(strArr[index]);
				System.out.print(num+ " ");
			}catch(NumberFormatException ne)
			{
				
			}
		}
	}
	
	public static void main(String[] args) {
		FindNumFromstringUsingTryCatch_A40 a40 = new FindNumFromstringUsingTryCatch_A40();
		String str =  "I have 5 years and 3 months of exp";
		String str1 = "I have 15 years and 9 months of exp";
		a40.findNumberInString(str);
		a40.findNumberInString(str1);
		
	}
	
}
