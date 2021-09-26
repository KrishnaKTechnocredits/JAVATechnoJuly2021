package sourabh;

class Assignment_15_3{                // difference between sum of even number - sum of odd numbers

	int finddifference(int[] numarr){
		int evenSum = 0;
		int oddSum = 0;

		for(int index = 0; index < numarr.length; index++){
			if(numarr[index] % 2 == 0)
				evenSum = evenSum + numarr[index];
			else
				oddSum = oddSum + numarr[index];
		}
		if(evenSum > oddSum)
			return evenSum - oddSum;
		else 
			return oddSum - evenSum;
	}

	public static void main(String[] args){
	int[] arr = {12,2,13,9};

	Assignment_15_3 assignment_15_3 = new Assignment_15_3();
	System.out.println("Difference between sum of even number - sum of odd numbers is "+assignment_15_3.finddifference(arr));
	}
} 
