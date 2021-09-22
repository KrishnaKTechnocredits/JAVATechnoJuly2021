package dattaraj;

public class Assignment31_P3 {
	void getTriplets(int[] input) {

		int index = 0;
		System.out.println("The triplets are: ");
		while (index < input.length - 2) {
			int num1 = input[index];
			if ((input[index + 1] == num1 + 1) && (input[index + 2] == num1 + 2)) {
				System.out.println(input[index]+","+input[index+1]+","+input[index+2]);
			}
			index++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		Assignment31_P3 p3 = new Assignment31_P3();
		p3.getTriplets(arr);
	}

}
