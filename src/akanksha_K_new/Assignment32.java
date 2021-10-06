package akanksha_K_new;

public class Assignment32 {
	
	void getTriplet(int[] arr) {
		int sum =0;
		int count= 0;
		int countNumSum=0;
		int index=0;
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i]+1 == arr[i+1] && arr[i+1]+1 ==arr [i+2]) {
				count++;
				sum= arr[i] + arr[i+1] + arr[i+2];
				
				if(sum > countNumSum) {
					countNumSum = sum;
					index = i;
				}
			}
		}
			
			System.out.println("Total count of consecutive number is: " + count);
			System.out.println(arr[index]+  "," + arr[index+1] + ","+ + arr[index +2] +  
					" is a triplet having maximum sum-  " +countNumSum);
			
		}
		
		public static void main(String[] args) {
			int[] arr= {10, 64, 65, 66, 23, 24, 25, 26, 61, 62};
			Assignment32 assi= new Assignment32();
			assi.getTriplet(arr);
		}
}
