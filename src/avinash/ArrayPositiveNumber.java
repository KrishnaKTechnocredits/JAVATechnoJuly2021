package avinash;

public class ArrayPositiveNumber {
	
	int countOfPositiveNumbers(int[] arr) {
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>0)
				count++;
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ArrayPositiveNumber arraypositivenumber = new ArrayPositiveNumber();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("\n Count of positive numbers in the given range :: "+ arraypositivenumber.countOfPositiveNumbers(input));

	}

}
