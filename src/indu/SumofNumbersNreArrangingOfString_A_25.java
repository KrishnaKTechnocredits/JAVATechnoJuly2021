package indu;

import java.util.Scanner;

public class SumofNumbersNreArrangingOfString_A_25 {
	
	int sumOfNuminString(String input)
	{
		int sum =0 ;
		String[] strArray= input.split("[^0-9]+");
		for(int i=1;i<strArray.length;i++)
		{
			sum += Integer.parseInt(strArray[i]);
		}
		return sum;
	}

	String arrangeUpperLowerNumber(String str)
	{
		
		String strTemp1 = str.replaceAll("[^A-Z]" ,"");
		String strTemp2 = str.replaceAll("[^a-z]","");
		String strTemp3 = str.replaceAll("[^0-9]","");
		return strTemp1 + strTemp2 + strTemp3;
	}
	
	public static void main(String[] arg)
	{
		SumofNumbersNreArrangingOfString_A_25 a25 = new SumofNumbersNreArrangingOfString_A_25();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String :");
		String input = scan.next();
		System.out.println("Output rearranged string is :" + a25.arrangeUpperLowerNumber(input));
		System.out.println("Output sum is  :" + a25.sumOfNuminString(input));
	}
}
