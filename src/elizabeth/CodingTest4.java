/*Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
We need to shift all zeros at the end of output array */

package elizabeth;
import java.util.Arrays;

class CodingTest4{

int[] getOutput(int[] input){
	int[] output=new int[input.length];
	int index1=0;
	for(int index=0;index<input.length;index++){
		if(input[index]!=0){
			output[index1]=input[index];
			index1++;
		}
	}
	return output;
}

public static void main(String[] args){
		CodingTest4 codingTest4=new CodingTest4();
		int input[]={1,0,0,6,0,2,3,0,4,0,5,0,0};
		System.out.println("Output is: " +Arrays.toString(codingTest4.getOutput(input)));
	}
	
}