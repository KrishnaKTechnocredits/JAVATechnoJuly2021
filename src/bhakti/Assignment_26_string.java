
/* /

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable
inpupt : 34
output: 43

Program : 4 
swap 2 numbers without using 3rd variable

34  = 43



===============*/


 


package bhakti;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_26_string {
	//Program : 1:	WAP to print Reverse a given String.
	void revreseString(String input) {
		String output="";
		for (int index= (input.length()-1); index >=0; index--) 
			output+=input.charAt(index);
		System.out.println("Reverse string : ");
		System.out.println(output);
		System.out.println("------------------------------------------");	
	}
	//Program : 2 :	reverse given string array.
	void reverseArray(String[] arrayStr) {
		
		String[] revereTest= new String[arrayStr.length];
		int x=0;
		
		for (int index=arrayStr.length-1; index>= 0; index-- ) {
			revereTest[x]=arrayStr[index];
			x++;
		}	
		System.out.println("Reverse Array "+Arrays.toString(revereTest));
		System.out.println("------------------------------------------");
		
	}
	
	//Program : 3:	swap 2 numbers with using 3rd variable
	void swapNumberUsing3rdVariable(int number1, int number2) {
		 
		int temp=0;
		temp=number1;
		number1= number2;
		number2= temp;
		System.out.println(number1+ "," +number2);
		System.out.println("------------------------------------------");
			
	}
	
	
	
	//Program :  :	revrese number:  inut 234, putput: 432
	void reverNumberwithoutVariable() {
		int number=1882;
		String numberString= number+"";
		String revreseNumber="";
		for (int index= numberString.length()-1; index>=0; index--)
			revreseNumber=revreseNumber+ numberString.charAt(index);
		System.out.print(revreseNumber);
		System.out.println("------------------------------------------");
	}
	
	// Program : 4:	swap 2 numbers with using 3rd variable
	
	void swapNumberWIthoutvariable(int number1, int number2) {
		
		System.out.println("Number 1: "+number1+", Number2: "+number2);
		number1=number1+number2;  
		number2=number1-number2;
		number1= number1-number2;
		System.out.println("Post swap");
		System.out.println("Number 1: "+number1+", Number2: "+number2);
		System.out.println("------------------------------------------");
	}
	
	
	public static void main(String[] hh) {
		Assignment_26_string assignment_25_string= new Assignment_26_string();
		
		System.out.println("Enter string: ");
		Scanner scanner= new Scanner (System.in);
		String input= scanner.nextLine();
	
		assignment_25_string.revreseString(input);
		String[] test= {"Bhakti","Mohit", "Priya" , "Vaishanvi"};
		assignment_25_string.reverseArray(test);
		
		assignment_25_string.swapNumberUsing3rdVariable(20, 30);
		assignment_25_string.swapNumberWIthoutvariable(20, 30);
		
	}

}
