package chandani;

class Assignment14a{
	
	int getMaxNumber(int[] arr){
		
		int max = arr[0];
		for(int index = 0; index < arr.length; index++){
			if (arr[index] > max) {
			 max = arr[index] ;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		Assignment14a assignment14a = new Assignment14a();
		int[] input = new int[] {1,11,44,23,55,99,23};
		System.out.println("\nMax Number from the given array is : \n" +assignment14a.getMaxNumber(input));

	}
}