package husain;

public class Assignment_13_Program3 {

	int number;

	int[] arrayOfNumbers(int num) {
		number = num;
		int arr[] = new int[5];

		for (int index = 0; index < arr.length; index++) {
			num--;
			arr[index]= num;
		}
		return arr;
	}
	
	void displayNumbers() {
		int[] output = arrayOfNumbers(50);
		System.out.println("The list of 5 numbers less than "+number+" is: ");
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index] +" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_13_Program3 obj1 = new Assignment_13_Program3();
		obj1.displayNumbers();
	}

}
