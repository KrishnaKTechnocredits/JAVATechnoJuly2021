/*
 * Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u

 */

package tanmoy_Roy.Assignment34;

import java.util.Arrays;

public class Program {
	
	 void setZeroAfterTriplet(int[] input) {
		int i,count=0,n=input.length,k=2;
		for(i=0;i<input.length-2;i++) 
			if(input[i+1]==input[i]+1 && input[i+2]==input[i+1]+1) //get count of triplets
				count++;
		int[] arr =new int[count+n];
		arr[0]=input[0];
		arr[1]=input[1];
		for(i=2;i<input.length;i++) {
			arr[k++]=input[i];
			if(input[i-1]==input[i-2]+1 && input[i]==input[i-1]+1) 
				arr[k++]=0;
		}
			
		
		System.out.println("The reaaranged array with Sum after triplet is :"+Arrays.toString(arr));
	}
	 
	 void setSumAfterTriplet(int[] input) {
		int i,count=0,n=input.length,k=2;
		for(i=0;i<input.length-2;i++) 
			if(input[i+1]==input[i]+1 && input[i+2]==input[i+1]+1) 
				count++;
		int[] arr =new int[count+n];
		arr[0]=input[0];
		arr[1]=input[1];
		for(i=2;i<input.length;i++) {
			arr[k++]=input[i];
			if(input[i-1]==input[i-2]+1 && input[i]==input[i-1]+1) 
				arr[k++]=input[i]+input[i-1]+input[i-2];
		}
		
			System.out.println("The reaaranged array with Sum after triplet is :"+Arrays.toString(arr));
	}
	 
	 void getFirstNonRepeatingVowel(String input) {
		 String str=input;
		 
		 while(str.length()!=0) {
			int n=str.length();
			str=str.replace(Character.toString(str.charAt(0)),"");
		 	if(n-str.length()==1 && str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' 
		 			|| str.charAt(0)=='o' || str.charAt(0)=='u') {
		 		System.out.println("The First NonRepeating Vowel is:"+str.charAt(0));
		 		break;
		 	}
		 }
	 }

	public static void main(String[] args) {
		Program prg = new Program();
		int[] input1= {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("The Array : "+Arrays.toString(input1));
		prg.setZeroAfterTriplet(input1);
		
		int[] input2 = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("The Array : "+Arrays.toString(input2));
		prg.setSumAfterTriplet(input2);
		
		String input="aeapquawrpti";
		System.out.println("The String : "+input);
		prg.getFirstNonRepeatingVowel(input);
	
	}

}
