package pritiprogrammesonNumbers;

import java.util.Arrays;

public class Assingment_34_2 {
	int findNewArrayLength(int[] input) {
		int countTriple=0;
		for(int index=0;index<input.length-2;index++) {
			int num = input[index];
			if ((num+1)==input[index+1])
				if ((num+2)==input[index+2]) 
					countTriple++;		
		}
		return countTriple;	
	}
	
	int[] newArrayWithSumOfTripletAfterTriplet(int []input) {
		int newArraylength = input.length+ findNewArrayLength(input);
		int []output= new int[newArraylength];
		int outputIndex=0;
		for(int index=0;index<input.length;index++) {
			if (index<input.length-2) {
				if (input[index]+1==input[index+1]&& input[index]+2==input[index+2]) {
					output[outputIndex]= input[index];
					outputIndex++;
					output[outputIndex]= input[index+1];
					outputIndex++;
					output[outputIndex]= input[index+2];
					outputIndex++;
					output[outputIndex]=input[index]+input[index+1]+input[index+2];
					outputIndex++;
					index= index+2;
				}else {
					output[outputIndex]= input[index];
					outputIndex++;
				}
			}else
				output[outputIndex]=input[index];
			
		}
		return output;
	}
	
	
	public static void main(String[]a) {
		Assingment_34_2 assingment_34_2= new Assingment_34_2();
		int []input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("Output Array after placing sum of triplet after triple:");
		System.out.println(Arrays.toString(assingment_34_2.newArrayWithSumOfTripletAfterTriplet(input)));
	}

}
/*program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/
