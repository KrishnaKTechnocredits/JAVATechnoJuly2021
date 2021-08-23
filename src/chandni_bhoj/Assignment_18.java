package chandni_bhoj;

import java.util.Arrays;

public class Assignment_18 {
	

	String reverseString (String input) {
		String output = " ";
		for (int index = input.length()-1; index>=0; index--) {
			output += input.charAt(index);
		}
		return output;

	}

		String [] reverseElementsAtSamePosition (String [] input1) {
			for (int index = 0; index<input1.length; index++) {
				input1[index] = reverseString(input1[index]);
			}
			return input1;
		}

		String [] reverseElementsAndPlaceInReverseOrder (String [] input2) {
			String [] output1 = new String [input2.length];
			int count = 0;
			for (int index = input2.length-1; index>=0; index--) {
				output1 [count] = reverseString(input2[index]);
				count++;
			}
				return output1;
			}

		public static void main(String[] args) {
			Assignment_18 assignment_18 = new Assignment_18 ();
			String [] input1 = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
			assignment_18.reverseElementsAtSamePosition(input1);
			System.out.println (Arrays.toString(assignment_18.reverseElementsAtSamePosition(input1)));

			String [] input2 = {"techno", "credits", "krishna","harsh"};
			assignment_18.reverseElementsAndPlaceInReverseOrder(input2);
			System.out.println (Arrays.toString(assignment_18.reverseElementsAndPlaceInReverseOrder(input2)));

		}

	

}
