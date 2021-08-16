package chandani;

class Assignment13a{
	
	int getPositiveNumber(int[] arr){
		int count = 0;
		for(int index = 0; index < arr.length; index++){
			if(arr[index]>0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Assignment13a assignment13a = new Assignment13a();
		int[] arr = new int[]{1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Positive numbers in given array are " + assignment13a.getPositiveNumber(arr));

	}
}