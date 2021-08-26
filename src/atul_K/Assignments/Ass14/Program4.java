/* program 4 : print difference between max odd number and max even number from given array. 
 * difference should be positive
 */
package atul_K.Assignments.Ass14;

public class Program4 {

	void difmaxoddeven(int[] arr) {
		int maxeven = 0;
		int maxodd = 0;
		for (int index =0; index < arr.length; index++) {
			if (arr[index]%2 == 0) {
				if (maxeven < arr[index])
					maxeven = arr[index];
			} else {
				if (maxodd< arr[index])
					maxodd = arr[index];
			}
		}
		if (maxeven > maxodd)
			System.out.println(maxeven-maxodd);
		else 
			System.out.println(maxodd - maxeven);
	}
	public static void main (String[] args) {
		int[] arr = {1,11,44,23,55,99,23,22};
		Program4 p4 = new Program4();
		p4.difmaxoddeven(arr);
	}
}
