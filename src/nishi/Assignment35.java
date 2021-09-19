/*
Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */
package nishi;

import java.util.Arrays;

import loopdemo.Example4;

public class Assignment35 {
	/*
	Write a program to verify given number plate number is valid or not.
	String p1 = "MH 12 BK 4432"; //valid
	String p2 = "MH-12 BK 1432"; //valid
	String p4 = "GJ 05 MK 1123"; // Valid
	String p3 = "MH 12-BK 4432"; // invalid
	 */
	

		boolean getValidNumberPlate(String input)
		{
			String[] arr=input.split(" ");		
			
		if(arr.length==4)
		{
			if(!Character.isUpperCase(arr[0].charAt(0)) && (!Character.isUpperCase(arr[0].charAt(1))))
			{
				
				return false;
			}
			else
			{
				if(!Character.isDigit(arr[1].charAt(0)) && (!Character.isDigit(arr[1].charAt(1))))
				{
					return false;
				}
				else
				{
					if(!Character.isUpperCase(arr[2].charAt(0)) && (!Character.isUpperCase(arr[2].charAt(1))))
					{
						return false;
					}
					else
					{
						if(!Character.isDigit(arr[3].charAt(0)) && (!Character.isDigit(arr[3].charAt(1))) && (!Character.isDigit(arr[3].charAt(2)))
								&& (!Character.isDigit(arr[3].charAt(3))))
						{
							return false;
						}
						else
						{
							return true;
						}
					}
				}
				
			}
		}
		
		if(arr.length==3)
		{
			if(!Character.isUpperCase(arr[0].charAt(0)) && (!Character.isUpperCase(arr[0].charAt(1))) && arr[0].charAt(2)=='-'
				&& (!Character.isDigit(arr[0].charAt(3))) && (!Character.isDigit(arr[0].charAt(4))))
			{
				
				return false;
			}
			else
			{				
					if(!Character.isUpperCase(arr[1].charAt(0)) && (!Character.isUpperCase(arr[1].charAt(1))))
					{
						return false;
					}
					else
					{
						if(!Character.isDigit(arr[2].charAt(0)) && (!Character.isDigit(arr[2].charAt(1))) && (!Character.isDigit(arr[2].charAt(2)))
								&& (!Character.isDigit(arr[2].charAt(3))))
						{
							return false;
						}
						else
						{
							return true;
						}
					}			
				
			}
		}
		else
		{
			return false;
		}		
			
		}
		
		void displayValidNoPlate(String input)
		{
			boolean flag=getValidNumberPlate(input);
			if(flag)
			{
				System.out.println("Valid no plate");
			}
			else
			{
				System.out.println("Invalid no plate");
			}
		}
		
		public static void main(String[] args) {
			String p1 = "MH 12 BK 4432"; 
			String p2 = "MH-12 BK 1432"; 			
			String p3 = "MH 12-BK 4432";
			String p4 = "GJ 05 MK 1123"; 
			Assignment35 assignment35=new Assignment35();
			assignment35.displayValidNoPlate(p1);
			assignment35.displayValidNoPlate(p2);
			assignment35.displayValidNoPlate(p3);
			assignment35.displayValidNoPlate(p4);
			
		}
		
	
	
}
