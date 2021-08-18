package swati;
class DiffBetweenSumEvenAndSumOdd{
	int evenSum,oddSum;
	
	void returnEvenOddSum(int[] input){
		evenSum=0;
		oddSum=0;
		for(int index=0;index<input.length;index++){
			if(input[index]%2==0){
				evenSum=evenSum+input[index];
			}
			else{
				oddSum=oddSum+input[index];
			}
		}
	}
	
	int returnDiff(){
		if(evenSum>oddSum)
			return evenSum-oddSum;
		else
			return oddSum-evenSum;
	}
	
	public static void main(String[] a){
		DiffBetweenSumEvenAndSumOdd diffOddEven=new DiffBetweenSumEvenAndSumOdd();
		int[] input1={12,2,13,9};
		diffOddEven.returnEvenOddSum(input1);
		int diff=diffOddEven.returnDiff();
		System.out.println("Difference between sum of even number - sum of odd numbers:"+diff);
		int[] input2 = {13,22,10,3};
		diffOddEven.returnEvenOddSum(input2);
		diff=diffOddEven.returnDiff();
		System.out.println("Difference between sum of even number - sum of odd numbers:"+diff);
	}
}