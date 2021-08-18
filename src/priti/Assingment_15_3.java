package priti;

class Assingment_15_3{
	
	int getDiffBetSumOfEveAnnOddNum(int[] input) {
		int sumEvenNum = 0; 
		int sumOddNum = 0;
		int diffOfOddAndEven= 0;
		for (int index=0 ; index<input.length;index++) {
			if (input[index]%2==0) {
				sumEvenNum = sumEvenNum+input[index];
			}else {
				sumOddNum = sumOddNum+input[index];
			}
			if (sumOddNum>sumEvenNum) {
				diffOfOddAndEven=sumOddNum - sumEvenNum;
			}else {
				diffOfOddAndEven= sumEvenNum - sumOddNum;
			}
		}
		return diffOfOddAndEven;
		
	}
	
	int getDiffBetSumOfOddAndEvenNum(int[] numbers) {
		int sumEvenNum = 0; 
		int sumOddNum = 0;
		int diffOfEveAndOdd= 0;
		for (int index=0 ; index<numbers.length;index++) {
			if(numbers[index]%2==0) {
				sumEvenNum =sumEvenNum +numbers[index];
			}else {
				
				sumOddNum = sumOddNum+numbers[index];
			}
			if (sumEvenNum>sumOddNum) {
				diffOfEveAndOdd = sumEvenNum - sumOddNum;
			}else {
				diffOfEveAndOdd = sumOddNum - sumEvenNum;
			}
		}
		return diffOfEveAndOdd;
	}
	
	

	public static void main(String[] a){
		int[] arr = {12,2,13,9};
		Assingment_15_3 assingment_15_3 = new Assingment_15_3();
		int ans =assingment_15_3.getDiffBetSumOfEveAnnOddNum(arr);
		System.out.println("Difference between sum of odd numbers - sum of even number = "+ ans );
		
		//int[] arr1 = {13,22,10,3};
		int [] arr1 = new int[4];
		arr1[0] = 13;
		arr1[1] = 22;
		arr1[2] = 10;
		arr1[3] = 3;
		
		int ans1 = assingment_15_3.getDiffBetSumOfOddAndEvenNum(arr1);
		System.out.println("Difference between sum of even number - sum of odd numbers = "+ ans1 );
		
	}
} 