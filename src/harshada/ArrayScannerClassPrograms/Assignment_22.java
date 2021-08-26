/* Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
*/
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;

import harshada.SumOfDigitsInString;

public class Assignment_22 {
	
	int getDigitsInString(String inputStr) {
		
		int count=0;
		for(int index=0;index<inputStr.length();index++) {
			if (Character.isDigit(inputStr.charAt(index)))
					count++;		
			}
		return count;
	}
	
	int getSumOfDigitsInString(String inputStr) {
		int sum = 0;

		for (int index = 0; index < inputStr.length(); index++) {
			if (Character.isDigit(inputStr.charAt(index))) {
				sum += Character.getNumericValue(inputStr.charAt(index));
			}

		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22 assignment_22=new Assignment_22();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println("Press 1 - To find count of digits  Press 2 - To find sum of digits ");
		int choice=sc.nextInt();
		if(choice==1) {
		int count=assignment_22.getDigitsInString(str);
		System.out.println("Count of Digits= "+ count);
		}
		else if(choice==2) {
		int sum=assignment_22.getSumOfDigitsInString(str);
		System.out.println("sum of Digits= "+sum);
		}
		else
			System.out.println("Invalid Choice ");
		sc.close();
	}

}
