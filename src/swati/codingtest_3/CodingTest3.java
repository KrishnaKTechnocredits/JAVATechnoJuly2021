package swati.codingtest_3;

import java.util.Arrays;

public class CodingTest3 {
	void removeElementFromArray(int[] input,int number) {
		int[] output= new int[input.length-1];
		int outindex=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]!=number) {
				output[outindex++]=input[index];
			}
				
		}
	 System.out.println("Output Array:"+ Arrays.toString(output));	
	}
	
	public static void main(String[] a) {
		CodingTest3 removeElement=new CodingTest3();
		int input[]= {25,14,56,15,36,77,18,29,49};
		removeElement.removeElementFromArray(input, 14);
		
	}

}
