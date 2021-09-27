package aniket;

public class Assignment_33_4 {
	
	int count=0;
	int sum=0;
	int conNumSum=0;
	int conIndex=0;
	void getTriplet(int arr[]) {
		for(int index=0;index<arr.length-2;index++) {
			if(arr[index]+1==arr[index+1] && arr[index+1]+1==arr[index+2]) {
				count++;
				sum=arr[index]+arr[index+1]+arr[index+2];
			}
			
			if(sum>conNumSum) {
				conNumSum=sum;
				conIndex=index;
				
			}
			
			
			
		}
		System.out.println("Total count of consecutive number is : " + count);
		System.out.println(arr[conIndex]+","+arr[conIndex+1]+","+arr[conIndex+2]+" is a triplet having max sum " + conNumSum);
	}
	
	public static void main(String[] args) {
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		
		Assignment_33_4 assignment_33_4 = new Assignment_33_4();
		assignment_33_4.getTriplet(input);
	}
	
	
}
