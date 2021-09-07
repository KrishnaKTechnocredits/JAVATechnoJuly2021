package precilla.codingtest3;

import java.util.Arrays;

public class ArrayProgram {
	void arrayRemoveNumber(int[] input,int specificElement) {
		int output[]= new int[input.length];
		int index;
		for(index=0;index<input.length;index++) {
			if(input[index]!=specificElement) {
				output[index]=input[index];
				System.out.print(output[index]+" ");
			}
		}	
	}
		
	public static void main(String[] args) {
		int[] input= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		ArrayProgram arrayProgram=new ArrayProgram();
		int specificElement=14;
		System.out.println("Input :"+Arrays.toString(input));
		System.out.println("Specific Number :"+specificElement);
		System.out.print("Output :");
		arrayProgram.arrayRemoveNumber(input,specificElement);
	}

}
