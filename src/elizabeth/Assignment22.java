/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package elizabeth;

import java.util.Scanner;
class Assignment22{
	
	int getTotalDigits(String input){
		int count=0;
		for(int index=0;index<input.length();index++){
				boolean flag=Character.isDigit(input.charAt(index));
				if(flag){
					count++;	
				}
		}
		return count;
	}
	
	int	 getSumOFAllDigits(String input){
		int sum=0;
		boolean flag=false;
		for(int index=0;index<input.length();index++){
			flag=Character.isDigit(input.charAt(index));
			if(flag){
				int output=Character.getNumericValue(input.charAt(index));
				sum+=output;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Assignment22 assignment22=new Assignment22();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=scanner.next();
		System.out.println("Total digits in a given string: ");
		System.out.println(assignment22.getTotalDigits(str));
		
		System.out.println("Enter the String: ");
		String str1=scanner.next();
		System.out.println("Sum of all the digits in a given string: ");
		System.out.println(assignment22.getSumOFAllDigits(str1));
	}
}