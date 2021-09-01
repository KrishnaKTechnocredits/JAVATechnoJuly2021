package neha.assignment_26;

import java.util.Arrays;

/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/
public class StringProgram2 {
	String[] displayReversedStrArr(String[] strArr) {
		int arrLength = strArr.length;
		String[] revArr = new String[arrLength];
		int counter = 0;
		for (int index = arrLength - 1; index >= 0; index--) {
			revArr[counter] = strArr[index];
			counter++;
		}
		return revArr;
	}

	public static void main(String[] args) {
		StringProgram2 stringProgram2 = new StringProgram2();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Reversed string is-->" + Arrays.toString(stringProgram2.displayReversedStrArr(input)));

	}
}
