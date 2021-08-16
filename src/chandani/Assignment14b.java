package chandani;

class Assignment14b{
	
	int getMinNumber(int[] arr){
		
		int min = arr[0];
		for(int index = 0; index < arr.length; index++){
			if (arr[index] < min) {
			 min = arr[index] ;
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		Assignment14b assignment14b = new Assignment14b();
		int[] input = new int[] {1,11,44,23,55,99,23};
		System.out.println("\nMin Number from the given array is : \n" +assignment14b.getMinNumber(input));

	}
}