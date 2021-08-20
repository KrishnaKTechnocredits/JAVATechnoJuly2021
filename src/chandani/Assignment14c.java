package chandani;

class Assignment14c{
	
	int getMaxMinDiff(int[] arr){
		
		int max = arr[0];
		int min = arr[0];
		for(int index = 0; index < arr.length; index++){
			if (arr[index] > max) {
			 max = arr[index] ;
			}
			if (arr[index] < min) {
			 min = arr[index] ;
			}
		}
		return max - min;
	}
	
	public static void main(String[] args){
		Assignment14c assignment14c = new Assignment14c();
		int[] diff = new int[] {1,11,44,23,55,99,23};
		System.out.println("Difference between Max Number and Min Number is " + assignment14c.getMaxMinDiff(diff));	

	}
}