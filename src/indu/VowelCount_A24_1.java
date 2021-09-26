package indu;

import java.util.Scanner;

public class VowelCount_A24_1 {

	int vowelCount(String str)
	{
		int aCount = 0 ,eCount = 0 ,iCount = 0 ,oCount = 0,uCount = 0,totalCount = 0;
		//String[] arr = str.split("[^a e i o u]+");
		String vowels = "";
		for(int index=0 ;index<str.length() ;index++)
		{
			switch(str.charAt(index))
			{
				case 'a':
				case 'A':	
				if(aCount<1)
				{
					aCount++;
					vowels += str.charAt(index)+" ";
				}
				totalCount++;
				break;
				case 'e':
				case 'E':	
				if(eCount<1) 
				{
					eCount++;
					vowels += str.charAt(index)+" ";
				}
				totalCount++;
				break;
				case 'i':
				case 'I':	
				if(iCount<1)
				{
					iCount++;
					vowels += str.charAt(index) +" ";
				}
				totalCount++;
				break;
				case 'o':
				case 'O':	
				if(oCount<1)
				{
					oCount++;
					vowels += str.charAt(index)+" ";
				}
				totalCount++;
				break;
				case 'u':
				case 'U':	
				if(uCount<1)
				{
					uCount++;
					vowels += str.charAt(index)+" ";
				} 
				totalCount++;
			}
			
		}
		System.out.println("Vowels in given string are : " +vowels);
		return totalCount;
	}
	
	public static void main(String[] arf)
	{
		VowelCount_A24_1 vowelCount_A24_1 = new VowelCount_A24_1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input String is : ");
		String str = scan.nextLine();	
		System.out.println("The count of total vowels in string : " +vowelCount_A24_1.vowelCount(str));
	}
}
