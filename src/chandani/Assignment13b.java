package chandani;

class Assignment13b{
	
	int getCountNumber0(int[] arr){
		int count = 0;
		for(int index = 0; index < arr.length; index++){
			if(arr[index]==0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Assignment13b assignment13b = new Assignment13b();
		int[] arr = new int[]{1,-11,0,0,55,0,-23,0};
		System.out.println("Number of 0's in a given array are " + assignment13b.getCountNumber0(arr));
	}
}