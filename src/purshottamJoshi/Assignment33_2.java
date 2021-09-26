/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12*/
package purshottamJoshi;
class Assignment33_2{

	void placementOfNegativeNumbers(int[] input){
		int negativeCount=0;
		int[] output = new int[input.length];
		for(int index=0; index < input.length; index++) {
			if(input[index] < 0){
				//zeroCount++;
				output[negativeCount]=input[index];
				negativeCount++;
			}
		}
		
		int outputIndex=negativeCount;
		for(int index=0; index < input.length; index++) {
			if(input[index] >0){
				output[outputIndex]=input[index];
				outputIndex++;
			}
			
		}
		for(int index=0; index < output.length; index++) {
			System.out.println(output[index]+",");
		}
		
	}
	
	public static void main(String[] args){
	
		int[] input={1,-3,-2,11,44,55,-76,33,12};
	
		Assignment33_2 assignment33_2 = new Assignment33_2();
		assignment33_2.placementOfNegativeNumbers(input);		
	}
}