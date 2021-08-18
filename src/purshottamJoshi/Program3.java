package purshottamJoshi;

class Program3{
	int getDiffBetweenEvenSumAndOddSum(int[] arr) {
		int difference=0;
		int evenSum=0;
		int oddSum=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index] % 2 == 0) {
				evenSum = evenSum + arr[index];
			}
			if(arr[index] % 2 !=0) {
				oddSum=oddSum+arr[index];
			}
		}
		if(evenSum>oddSum) {
			difference = evenSum - oddSum;
		}else {
			difference = oddSum - evenSum;
		}
		return difference;
	}

	public static void main(String[] args){
		Program3 program3 = new Program3();
		int[] arr = {12,2,13,9};
		System.out.println("Difference between the odd sum & even sum: "+program3.getDiffBetweenEvenSumAndOddSum(arr));
	}
}