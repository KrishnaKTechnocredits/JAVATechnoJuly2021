             /* Program 2 : Max repeating word with its freq.
             input : Hi Hello Hi Techno Hello Hi
             output : Hi - 3 
			 */

package somnath;
public class Assignment24_2{

	void getRepeatingWordinString(String str) {

		int maxcount = 0;
		String[] arr = str.split(" ");
		String maxrepeatword = "";
		String temp;

		for(int index=0; index<arr.length; index++) {
			int count = 0;
			temp = arr[index];
			for(int index1=0; index1<arr.length; index1++) {
				if(temp.equals(arr[index1]))
					count++;
			}

			if(maxcount < count) {
					maxcount = count;
					maxrepeatword = arr[index];	
			}
		}
		System.out.println("Max repeating word with its freq. is : " + maxrepeatword + " : " + maxcount);
	}

	public static void main(String[] args) {
		Assignment24_2 assignment24_2 = new Assignment24_2();
		String input = "Hi Hello Hi Techno Hello Hi";
		assignment24_2.getRepeatingWordinString(input);
	}
}