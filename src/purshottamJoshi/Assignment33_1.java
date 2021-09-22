//Assignment - 33 : 11th Sep'2021
//Program 1 : shift all non zeros at the end.
//input : {1,0,3,4,0,2,88,0,0,22,34};
//output : [0,0,0,0,1,3,4,2,88,22,34]

package purshottamJoshi;
class Assignment33_1{
	
/*	void sortArray(int[] input){
		
		for(int index=0; index < input.length; index++){
			int key=input[index];
			int j =index-1;
			
			while(j >= 0 && input[j] > key){
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=key;
		}
		
		for(int index=0; index < input.length; index++){
			System.out.println(input[index]+" ");
		} 
		
	}*/
	
	void placementOfZeros(int[] input){
		int zeroCount=0;
		int[] output = new int[input.length];
		for(int index=0; index < input.length; index++) {
			if(input[index]==0){
				zeroCount++;
			}
		}
		int outputIndex=zeroCount;
		for(int index=0; index < input.length; index++) {
			if(input[index] !=0){
				output[outputIndex]=input[index];
				outputIndex++;
			}
			
		}
		for(int index=0; index < output.length; index++) {
			System.out.println(output[index]+",");
		}
	}
	
	public static void main(String[] args){
		int[] input = {1,0,3,4,0,2,88,0,0,22,34,10,20};
		
		Assignment33_1 assignment33_1 = new Assignment33_1();
		assignment33_1.placementOfZeros(input);
	}
}