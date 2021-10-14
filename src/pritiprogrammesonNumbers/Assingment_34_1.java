package pritiprogrammesonNumbers;

import java.util.Arrays;

public class Assingment_34_1 {
	int findNewArrayLength(int[] input) {
		int countTriple=0;
		for(int index=0;index<input.length-2;index++) {
			int num= input[index];
			if ((num+1)==input[index+1]) {
				if ((num+2)==input[index+2])
					countTriple++;
			}
		}
		
		return countTriple;
	}
	
	int[] placeZeroAfterTriple(int input[]) {
		int len = input.length+findNewArrayLength(input);
		int output[]= new int [len];
		int outputIndex=0;
		for (int index=0;index<input.length;index++) {
			if(index<input.length-2) {
				if(input[index]+1==input[index+1]&& input[index]+2==input[index+2]) {
					output[outputIndex]=input[index];
					outputIndex++;
					output[outputIndex]=input[index+1];
					outputIndex++;
					output[outputIndex]=input[index+2];
					outputIndex++;
					output[outputIndex]=0;
					outputIndex++;
					index= index+2;
				}else {
					output[outputIndex]=input[index];
					outputIndex++;
				}
			}else 
			output[outputIndex]=input[index];
		}
		return output;
	}
	
		
	public static void main(String[]a) {
		Assingment_34_1 assingment_34_1 = new Assingment_34_1();
		int []input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("Output Array after placing zero after the triplet:");
		System.out.println(Arrays.toString(assingment_34_1.placeZeroAfterTriple(input)));
	}

}
/*program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];*/
