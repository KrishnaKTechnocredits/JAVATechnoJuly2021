/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12*/
package purshottamJoshi;
class Assignment33_3 {
	
	void placementOfNegativeAndZeroNumbers(int[] input) {
		int negativeCount=0;
		
		int[] output = new int[input.length];
		for(int index=0; index < input.length; index++) {
			if(input[index] < 0) {
				output[negativeCount]=input[index];
				negativeCount++;
			}
		}
		int zeroCount=negativeCount;
		for(int index=0; index < input.length; index++) {
			if(input[index] == 0) {
				output[zeroCount]=input[index];
				zeroCount++;
			}
		}
		
		int outputIndex=zeroCount;
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
	
		int[] input={1,-3,0,-2,11,0,44,55,-76,33,0,12};	
		Assignment33_3 assignment33_3 = new Assignment33_3();
		assignment33_3.placementOfNegativeAndZeroNumbers(input);		
	}
}