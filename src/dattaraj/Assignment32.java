package dattaraj;

public class Assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		Assignment32 assign = new Assignment32();
		assign.getSumOfTrippletNumbers(arr);
	}
	
	void getSumOfTrippletNumbers(int[] arr) {
		int sum = 0;
		int index;
		int a = 0;

		for (index = 0; index < arr.length-2; index++) {


			if (arr[index] + 1 == arr[index + 1] && arr[index + 1] + 1 == arr[index + 2]) {
					if (sum < arr[index] + arr[index+1] + arr[index+2]) {
						sum = arr[index] + arr[index+1] + arr[index+2];
						a = index;
					}

			}

		}
		System.out.println("Max tripplets is: " +arr[a]+ " " +arr[a+1]+ " " +arr[a+2]+ " & sum: " + sum);

	}
}
