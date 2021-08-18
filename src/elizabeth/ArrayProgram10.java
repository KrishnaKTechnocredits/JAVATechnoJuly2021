/*program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8

output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16*/
package elizabeth;

class ArrayProgram10{
	
	int getDiffBetweenEvenSumAndOddSum(int[] arr){
		int difference=0;
		int evenSum=0;
		int oddSum=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]%2==0){
				evenSum=evenSum+arr[index];
			}
			if(arr[index]%2!=0){
				oddSum=oddSum+arr[index];
			}
		}
		if(evenSum>oddSum){
			difference=evenSum-oddSum;
		}else{
			difference=oddSum-evenSum;
		}
		return difference;
	}
	
	public static void main(String[] args){
		ArrayProgram10 arrayProgram10=new ArrayProgram10();
		int[] arr = {12,2,13,9};
		System.out.println("Difference between the odd sum and even sum: ");
		System.out.println(arrayProgram10.getDiffBetweenEvenSumAndOddSum(arr));
	}
}