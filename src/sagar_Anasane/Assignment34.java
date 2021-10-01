package sagar_Anasane;

public class Assignment34 {
	void placeZeroAfterTheTripple(int[] arr) {
		int[] output=new int[arr.length+3];
		for(int outIndex=0;outIndex<output.length;outIndex++) {
			//System.out.print(" "+output[outIndex]);
			for(int index=0;index<arr.length;index++) {
				if(output[outIndex]<arr[index]) {
					output[outIndex]=arr[index];
					System.out.print(" "+output[outIndex]+"\n");
				}
			}	
			System.out.print(" "+output[outIndex]);
		}
			
		/*for(int index=0;index<arr.length-2;index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]==arr[index]+1) {
					if(arr[index+2]==arr[index]+2) {
						output[index+3]=0;
					}
				}
			}
			System.out.print(" "+output[index]);
		}*/
	}
	
	public static void main(String[] args) {
		int[] input={1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		Assignment34 assignment34=new Assignment34();
		assignment34.placeZeroAfterTheTripple(input);
	}
}
