package somnath;
public class SmallerNumber {

	int[] findSmallerNumber(int number) {
		int[] output = new int[5];
		for (int index = 0; index < 5; index++) {
			number--;
			output[index] = number;
		}
		return output;
	}

	public static void main(String[] args) {
		SmallerNumber smallerNumber = new SmallerNumber();
        System.out.println("--------------*****------------------");
		System.out.println("Print 5 smaller numbers than 50 in array");
		int[] someArray = smallerNumber.findSmallerNumber(50);
		for (int index = 0; index < 5; index++)
	    System.out.print(someArray[index] + " ");
		System.out.println("\n----------------*****-------------------");

	}

}