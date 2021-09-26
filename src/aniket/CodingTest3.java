package aniket;

import java.util.Arrays;

public class CodingTest3 {
	//int specialNumber =14;
	int[] removeSpecificNumber(int[] input,int num) {
		int[] output= new int[input.length-1];
		   for(int index=0;index<input.length;index++) {
			   if(input[index]==num) {
				 for(int i=index;i<input.length-1;i++) {
					 input[i]=input[i+1];		 
				 }
			for( index=0;index<output.length;index++) {
				output[index]+=input[index];
			}	 
			   
		   }
		}
		return output;
	}
	public static void main(String[] args) {
		
		int[] input= {25,14,56,15,36,56,77,18,29,49};
		CodingTest3 codingtest_3 = new CodingTest3();
		  int[] output=codingtest_3.removeSpecificNumber(input, 14);
		  System.out.println("After removing special number from an array :"+Arrays.toString(output));
		  
		
	}
}
