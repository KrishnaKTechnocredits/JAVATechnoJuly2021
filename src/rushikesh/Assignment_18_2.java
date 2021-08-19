package rushikesh;

import java.util.Arrays;

public class Assignment_18_2 {

		String revString(String input) {
			String output="";
			for(int index=input.length()-1;index>=0;index--) {
				output+=input.charAt(index);
			}
			return output;
		}

		String[] reverseStringArr(String[] input) {
			String[] output=new String[input.length];
			int count=0;
			for(int index=input.length-1;index >=0;index--) {
				output[count]=revString(input[index]);
				count++;
			}	
			return output;
		}	
			
		public static void main(String[] args) {
			Assignment_18_2 assignment_18_2=new Assignment_18_2();
			String[] input = {"techno", "credits", "krishna","harsh"};
			String[] output=assignment_18_2.reverseStringArr(input);
			System.out.println("Reverse of given Array with position is :");
			System.out.println(Arrays.toString(output));
		}
}



