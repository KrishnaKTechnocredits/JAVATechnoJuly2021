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

package ritabrata;

import java.util.Arrays;

public class Assignment26 {
	void getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output=output+input.charAt(index);
		}
		System.out.println("The reverse of "+input+" is: "+output);
	}
	
	void getReverseArray(String[] input) {
		String arr[]= new String[input.length];
		int i=0;
		for(int index=input.length-1;index>=0;index--) {
			arr[i]=input[index];
			i++;
		}
		System.out.println("The reverse of  is: "+Arrays.toString(arr));
	}
	
	void exchangeNumWithThirdVarriable(int a, int b) {
		int p,q,r;
		p= a;
		q=b;
		r=p;
		p=q;
		q=r;
		System.out.println("Values after exchange of "+a+" and "+b+" are: "+p+" and "+q);		
	}
	
	void exchangeNumWithoutThirdVarriable(int a, int b) {
		int p,q;
		p=a;
		q=b;
		p= p+q;
		q=p-q;
		p=p-q;
		System.out.println("Values after exchange of "+a+" and "+b+" are: "+p+" and "+q);
	}

	public static void main(String[] args) {
		Assignment26 reverse= new Assignment26();
		reverse.getReverseString("This is technocredits");
		String[] arr= {"Credit", "Techno","From","Diwali","Happy"};
		reverse.getReverseArray(arr);
		reverse.exchangeNumWithThirdVarriable(9, 5);
		reverse.exchangeNumWithoutThirdVarriable(6, 8);
	}

}
