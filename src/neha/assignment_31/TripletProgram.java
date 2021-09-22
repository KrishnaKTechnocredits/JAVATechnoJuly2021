package neha.assignment_31;
/*Find triplets in given array
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/

public class TripletProgram {
	void displayTripletsInGivenArray(int[] arr) {
		System.out.println("Triplets are: ");
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2)
				System.out.println(arr[i] + "," + arr[i + 1] + "," + arr[i + 2]);
		}
	}

	public static void main(String[] args) {
		TripletProgram tripletProgram = new TripletProgram();
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		tripletProgram.displayTripletsInGivenArray(arr);
	}
}
