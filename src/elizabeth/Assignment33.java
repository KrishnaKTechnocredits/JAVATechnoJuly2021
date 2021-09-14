/*Assignment - 33 

*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

*Program 2: place all negative numbers at the beginning and all positive numbers at the end.*
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

*program 4 : find the triple which in sequence and having maximum sum*

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

package elizabeth;
import java.util.Arrays;

class Assignment33{
	
	int[] shiftNonZeroToEnd(int[] input){
		int count=0;
		int[]output=new int[input.length];
		for(int index=0;index<input.length;index++){
			if(input[index]==0){
					output[index]=input[index];
					count++;
			}
		}
		int index2=count;
		for(int index=0;index<(input.length);index++){
			if(input[index]!=0){
				output[index2]=input[index];	
				index2++;
			}
		}
		return output;
	}
	
	int[] shiftPositiveNumToEnd(int[] input){
		int count=0;
		int[]output=new int[input.length];
		for(int index=0;index<input.length;index++){
			if(input[index]<0){
					output[count]=input[index];
					count++;
			}
		}
		int index2=count;
		for(int index=0;index<(input.length);index++){
			if(input[index]>=0){
				output[index2]=input[index];	
				index2++;
			}
		}
		return output;
	}
	
	int[] arrangeNum(int[] input){
		int count=0;
		int zeroCount=0;
		int[]output=new int[input.length];
		for(int index=0;index<input.length;index++){
			if(input[index]<0){
					output[count]=input[index];
					count++;
			}else if(input[index]==0){
					zeroCount++;
			}
		}
		int positiveNum=count+zeroCount;
		for(int index=0;index<(input.length);index++){
			if(input[index]>0){
				output[positiveNum]=input[index];	
				positiveNum++;
			}
		}
		return output;
	}
	
	int[] getTripletWithMaxSum(int[] input){
		int sum=0;
		int maxSum=0;
		int[] triplet=new int[3];
		for(int index=0;index<input.length-2;index++){
			if(input[index]==input[index+1]-1 && input[index]==input[index+2]-2){
				sum=input[index]+input[index+1]+input[index+2];
			}
			if(maxSum<sum){
				maxSum=sum;
				triplet[0]=input[index];
				triplet[1]=input[index+1];
				triplet[2]=input[index+2];
			}
		}
		return triplet;
	}
	
	
	public static void main(String[] args){
		
		Assignment33 assignment33=new Assignment33();
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println(Arrays.toString(assignment33.shiftNonZeroToEnd(input)));
		int[] input1={1,-3,-2,11,44,55,-76,33,12};
		System.out.println(Arrays.toString(assignment33.shiftPositiveNumToEnd(input1)));
		int[] input2={1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println(Arrays.toString(assignment33.arrangeNum(input2)));
		int[] input3={1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println(Arrays.toString(assignment33.getTripletWithMaxSum(input3)));
	}	
	
}


