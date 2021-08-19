package chandani;

class Assignment14d{
	
	int getMaxOddMaxEvenNumDiff(int[] arr){
		
		int maxEven = 0;
		int maxOdd = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				if (arr[index] > maxEven)
					maxEven = arr[index];
			} else if (arr[index] > maxOdd)
					maxOdd = arr[index];

		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}
	
	public static void main(String[] args){
		Assignment14d assignment14d = new Assignment14d();
		int[] diff = new int[] {1,11,44,23,55,99,23,22};
		System.out.println("\nDifference between Max Odd Number and Max Even Number is : \n" +assignment14d.getMaxOddMaxEvenNumDiff(diff));
	}
}