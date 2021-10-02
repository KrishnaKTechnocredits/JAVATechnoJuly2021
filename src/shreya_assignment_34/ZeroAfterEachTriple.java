package shreya_assignment_34;

import java.util.Arrays;

public class ZeroAfterEachTriple {
	void getZeroAfterEachTriple(int[] arr) {
		int count=0;
		for(int index=0;index<=arr.length-3;index++) {
				if(arr[index]+1==arr[index+1]&&arr[index]+2==arr[index+2]) {
					count++;
				}
		}	
		int[] outputCount=new int[arr.length+count];
		int index=0;
			for(int index1=0;index1<arr.length;index1++) {
				if(index1<=arr.length-3) {
					if(arr[index1]+1==arr[index1+1]&&arr[index1]+2==arr[index1+2]) {
						outputCount[index]=arr[index1];
						index++;
						outputCount[index]=arr[index1+1];
						index++;
						outputCount[index]=arr[index1+2];
						index++;
						outputCount[index]=0;
						index++;
						index1=index1+2;
					}
					else {
						outputCount[index]=arr[index1];
						index++;
					}	
				}
				else {
					outputCount[index]=arr[index1];
				}
			}
			
		System.out.println("Array after placing zero after triple which in sequence\nOutput: "+Arrays.toString(outputCount));
		}
	
	public static void main(String[] args) {
		ZeroAfterEachTriple zeroAfterEachTriple = new ZeroAfterEachTriple();
		int[] arr= {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		zeroAfterEachTriple.getZeroAfterEachTriple(arr);

	}

}
