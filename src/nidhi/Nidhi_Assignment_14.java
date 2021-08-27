package nidhi;

class Nidhi_Assignment_14{
	int maxEvenNbr;
	int maxOddNbr;
	
	int findMaxNumber(int arr[]){
		int maxNbr=0;
		for (int i=0; i < arr.length ; i++){
			if (arr[i] > maxNbr){
				maxNbr = arr[i];
			}
		}
		return maxNbr;
	}
	
	int findMinNumber(int arr[]){
		int minNbr=arr[0];
		for (int i=1; i < arr.length ; i++){
			if (arr[i] < minNbr){
				minNbr = arr[i];
			}
		}
		return minNbr;
	}
	
	int diffMaxMin(int arr[]){
		int diffNum = findMaxNumber(arr)-findMinNumber(arr);
		return diffNum;
	}
	
	int findMaxEvenOddDiff(int arr[]){
		for (int i=0; i < arr.length ; i++){
			if ((arr[i] > maxEvenNbr) && (arr[i] % 2 == 0)){
				maxEvenNbr = arr[i];
			} else if ((arr[i] > maxOddNbr) && (arr[i] % 2 != 0))
			{
				maxOddNbr = arr[i];
			}
		}

		return maxOddNbr - maxEvenNbr;
	}
	
	public static void main(String[] args){
		Nidhi_Assignment_14 assignment14= new Nidhi_Assignment_14();
		int[] input1 = {1,11,44,23,55,99,23};
		System.out.println(assignment14.findMaxNumber(input1));
		System.out.println(assignment14.findMinNumber(input1));
		System.out.println(assignment14.diffMaxMin(input1));
		System.out.println(assignment14.findMaxEvenOddDiff(input1));

	}
}