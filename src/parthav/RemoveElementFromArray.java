/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49} */

package parthav;

public class RemoveElementFromArray {

	void removeSpecificArrayElement(int[] inputArr, int specificNumber) {
		int[] updatedArr = new int[inputArr.length];

		System.out.print("The returned array without the element " + specificNumber + " is {");

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] == specificNumber)
				continue;
			updatedArr[index] = inputArr[index];
			System.out.print(updatedArr[index] + " ,");

		}

		System.out.println("}");
	}

	public static void main(String[] args) {
		RemoveElementFromArray newObject = new RemoveElementFromArray();
		int[] inputArr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		newObject.removeSpecificArrayElement(inputArr, 14);

	}

}
