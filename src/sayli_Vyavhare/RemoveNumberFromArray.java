/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49} */
package sayli_Vyavhare;

public class RemoveNumberFromArray {

	void getRemovedNumberFromArray(int input[], int num) {
		System.out.println("After removing " + num + " array is: ");
		for (int index = 0; index < input.length; index++) {

			if (input[index] == num) {
				index++;
			}
			System.out.print(input[index] + " ");
		}
	}

	public static void main(String[] args) {
		RemoveNumberFromArray removenumber = new RemoveNumberFromArray();

		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		removenumber.getRemovedNumberFromArray(input, 14);
	}
}
