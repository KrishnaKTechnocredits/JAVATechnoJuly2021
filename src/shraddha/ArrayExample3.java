package shraddha;

public class ArrayExample3 {

	public static void main(String[] args) {
		ArrayExample3 arrayExample = new ArrayExample3();
		arrayExample.createAndPrintArray(108);
	}
	
	void createAndPrintArray(int input) {
		int[] newArray = new int[5];
		System.out.print("Array created by 5 smaller numbers by the given number("+input+") is:- [");
		for(int index=0;index<5;index++) {
			input--;
			newArray[index]=input;
			System.out.print(" "+newArray[index]);
		}
		System.out.println(" ]");
	}
}
