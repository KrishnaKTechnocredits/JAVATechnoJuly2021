//print middle character of word

package sneha;

public class Assignment_15_2 {
	
	void charAtMiddle(String[] arr) {
		//char c = 0 ;
		for(int index = 0; index < arr.length; index++) {
			String str = arr[index];
			//String[] brr = {str};
			int value = (str.length());
			int id = value / 2;
			System.out.println(str.charAt(id));
		}
		 
	}
	
	public static void main(String[] a) {
		String[] arr = {"Sneha", "India","helo"};
		Assignment_15_2 assignment_15_2 = new Assignment_15_2();
		assignment_15_2.charAtMiddle(arr);
		}

}
