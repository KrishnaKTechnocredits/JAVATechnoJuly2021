package shreya;

import java.util.Arrays;

public class Assignment18 {
	
	 
		String getReverseString(String str) {
			String reverse = "";
			for(int index = str.length() - 1; index >=0; index--)
				reverse = reverse + str.charAt(index);
			return reverse;
		}
		
		String[] getArrayElements(String[] arr) {
			for(int index = 0; index < arr.length; index++) {
				arr[index] = getReverseString(arr[index]);
			}
			return arr;
		}
		
		void displayArrayElementsInReverse(String[] arr) {
			getArrayElements(arr);
			System.out.println(Arrays.toString(arr));
		}
		public static void main(String[] args) {
			Assignment18 assignment18 = new Assignment18();
			String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
			assignment18.displayArrayElementsInReverse(input);
		}
	}

