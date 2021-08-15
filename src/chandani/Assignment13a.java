package chandani;

class Assignment13a{
	
	void getPositiveNumber(int[] arr){
		int count = 0;
		for(int index = 0; index < arr.length; index++){
			if(arr[index]>0){
				count++;
			}
		}
		System.out.println("Positive numbers in given array are " + count);
	}
	
	public static void main(String[] args){
		Assignment13a assignment13a = new Assignment13a();
		int[] arr = new int[]{1,-11,-44,23,55,-99,-23,-22};
		assignment13a.getPositiveNumber(arr);
	}
}