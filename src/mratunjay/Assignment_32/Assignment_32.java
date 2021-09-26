package mratunjay.Assignment_32;

public class Assignment_32 {

	int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66, 22, 23, 

24 };

	void getSumOfTrippletNumbers() {
		int sum = 0;
		int index;
		int a = 0;
		 
		for (index = 0; index < arr.length-2; index++) {
			
			 
			if (arr[index] + 1 == arr[index + 1] && arr

[index + 1] + 1 == arr[index + 2])
				
			if (sum < arr[index] + arr[index+1] + arr

[index+2]) {
				
				sum = arr[index] + arr[index+1] + arr

[index+2];
				a = index;
				
			}
		
	}
		System.out.println("Max of tripplets: " +arr[a]+ " " +arr[a+1]+ " " +arr[a+2]+ "   sum:  " + sum);

	}

	public static void main(String[] args) {

		Assignment_32 A_32 = new Assignment_32();
		A_32.getSumOfTrippletNumbers();

	}
}
