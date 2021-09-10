package kumar_Ashish.SCoding_Test;

import java.util.Arrays;
public class Sorting {
	void getSorted(int[] input){
		int[] output = new int[input.length];
		int count =0;
		for(int index = 0; index<input.length; index++ ){
			if(input[index] != 0){
				output[count]= input[index];
				count++;
			}
			else{
				output[count]= input[input.length-1];
			}	
		}
		System.out.println("Sorted Array : " + Arrays.toString(output));	
	}
	
	public static void main(String[] args){
		Sorting srtng = new Sorting();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		srtng.getSorted(arr);
	}

}
