/*Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

package bhakti;

import java.util.Arrays;

public class Assignment_33 {
	
	//Program 1 : shift all non zeros at the end.
	void shiftnumberAtEnd(int[] input) {
		int[] output= new int[input.length] ;
		int x=0;
		int count=0;
		for (int index=0; index< input.length; index++) {
			if (input[index]==0) 
				count++;
		}
		for (int index=0; index< input.length; index++) {
			if (input[index]>0) {
				output[count]=input[index];
				count++;
			}	
		}
		
		System.out.println(Arrays.toString(output));
	}
	
	//Program 2: place all negative numbers at the beginning and all positive numbers at the end.
	
	void placeNegativePositivenumber(int[] input) {
		int count=0;
		int[] output= new int [input.length];
		for (int index=0; index<input.length; index++){
			if (input[index]<0)
				count++;
		}
		int x=0;
		for (int index=0; index<input.length; index++){
			if (input[index]<0) {
				output[x]=input[index];
				x++;
			}
		}
	 
		for (int index=0; index<input.length ; index++){
			 
				if (input[index]>0) {
					output[count]=input[index];
					count++;
				}	
		
		}
		System.out.println(Arrays.toString(output));

	 }
	//program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
	
	void placeNegatibeZeroPositive(int[] input) {
		int[] output= new int[input.length];
		int count=0;
		int zerocount=0;
		int x=0;
		for (int i=0; i< input.length; i++) {
			if (input[i]<0)
				count++;
			if (input[i]==0)
				zerocount++;
		}
		
		for (int i=0; i < input.length; i ++) {
			if (input[i]<0) {
				output[x]=input[i];
				x++;
			}	
		}
		int fcount= zerocount+count;
		for (int i= 0; i < input.length; i++){
			if (input[i]>0) {
				output[fcount]=input[i];
				fcount++;
			}	
		}
		System.out.println(Arrays.toString(output));				
		
	}
	
	//program 4 : find the triple which in sequence and having maximum sum
	void tripleWithMaxSum(int[] input) {
		int Maxsum=0;
		int maxindext=0;
		for (int i=0; i< input.length-2; i++) {
			if (input[i]+1== input[i+1]) {
				if (input[i+1]+1 == input[i+2]) {
					
					int sum=input[i]+input[i+1]+input[i+2];
					if(Maxsum<sum) {
						Maxsum=sum;
						maxindext=i;
					}
				}		
					
			}		
		}
		System.out.println("Max sum of triple "+Maxsum);
		System.out.println(input[maxindext]+ " , "+ input[maxindext+1]+ " , " +input[maxindext+2]);
		
	}
	
	public static void main (String[] h) {
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		int[] input1= {1,-3,-2,11,44,55,-76,33,12};
		int[] input2 = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		int[] input3 = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		
		Assignment_33  assignment_33 = new Assignment_33();
		assignment_33.shiftnumberAtEnd(input);
		assignment_33.placeNegativePositivenumber(input1);
		assignment_33.placeNegatibeZeroPositive(input2);
		assignment_33.tripleWithMaxSum(input3);
		
		
	}

}
