package chandani;

class Assignment15c{

	int getElementLengthDiff(int[] arr){
		int sumeven = 0;
		int sumodd = 0;
		for (int index = 0; index< arr.length;index++){
			if(arr[index] % 2 == 0)
				sumeven+= arr[index];
			else
				sumodd+= arr[index];
		}
			if (sumeven > sumodd)
				return sumeven - sumodd;
			else 
				return sumodd - sumeven;
	}
	
	
	public static void main (String[] args){
		Assignment15c assignment15c = new Assignment15c();
		int[] arr = new int[] {12,2,13,9};
		System.out.println("Positive difference of even length name and odd length name is : " + assignment15c.getElementLengthDiff(arr));
	}	
}