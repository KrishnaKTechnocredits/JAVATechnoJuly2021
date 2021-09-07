/* Programming Test - 3
		WAP to remove a specific element from an array
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		specific number: 14
		output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/
package somnath;
import java.util.Arrays;
public class CodingTest3{
	int removeEleemnt = 14;
	void removeSpecificElement(int[] input){
		int[] output = new int[input.length-1];
		int outputIndex = 0;
		System.out.println("BEFORE REMOVING ELEMENT =" + Arrays.toString(input));
			for(int index = 0;index < input.length; index++){
				if(input[index]!=removeEleemnt){
					output[outputIndex]= input[index];
					outputIndex++;
			}
		}
			System.out.println("AFTER REMOVING ELEMENT  =" + Arrays.toString(output));
	}

		public static void main(String[] args){
			CodingTest3 codingTest3 = new CodingTest3();
			int[] input = { 25,14,56,15,36,56,77,18,29,49};
			codingTest3.removeSpecificElement(input);
	}
}	
			
	