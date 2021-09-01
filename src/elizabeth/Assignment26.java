/*Assignment - 26 : 1st Sep'2021

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

Program : 4 
swap 2 numbers without using 3rd variable*/
package elizabeth;
import java.util.Arrays;

class Assignment26{
	
	String getReverse(String input){
		String output="";
		for(int index=input.length()-1;index>=0;index--){
				output=output+input.charAt(index);
		}
		return output;		
	}
	
	String[] getReverseStringArray(String[] input){
		String[] output=new String[input.length];
		for(int index=0;index<=input.length-1;index++){
			output[index]=input[(input.length-1)-(index)];
		}
		return output;
	}
	
	void swapNumbersWithThirdVariable(int num1,int num2){
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Swap result of 2 numbers using 3rd variable :");
		System.out.println(num1+ "," +num2);
	}
	
	void swapNumbersWithoutThirdVariable(int num1,int num2){
		num2=num2-num1;
		num1=num1+num2;
		System.out.println("Swap result of 2 numbers without using 3rd variable :");
		System.out.println(num1+ "," +num2);
	}
	
	public static void main(String[] args){
		Assignment26 assignment26=new Assignment26();
		String[] input={"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("Reverse of the String is :" +assignment26.getReverse("This is technocredits"));
		System.out.println("Reverse of the given string array is :" +Arrays.toString(assignment26.getReverseStringArray(input)));
		assignment26.swapNumbersWithThirdVariable(30,40);
		assignment26.swapNumbersWithThirdVariable(10,30);
	}
}
