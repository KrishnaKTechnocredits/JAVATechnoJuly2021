package ashit_assignment_26;
import java.util.Arrays;

public class Program_2 {
	void getReverseString (String [] input) {
			String [] output = new String [input.length];
			for (int index = 0; index < input.length; index++) {
				output[index] = input[(input.length - 1) - index];
			}
			System.out.println ("Reverse Array is" + Arrays.toString(output));
	}

			public static void main(String[] args) {
				String [] input = {"Credits", "Techno","From","Diwali","Happy"};
				new Program_2().getReverseString(input);
			}


}


