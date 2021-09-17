/*Assignment - 27 : 2nd Sep'2021

WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical*/

package chandni_bhoj_Assignment_27;

public class Program_1 {
	
	void arraysIdenticalOrNot (int [] input1, int [] input2) {
		boolean flag = false;
		if (input1.length == input2.length) {
		for (int index = 0; index < input1.length; index++) {
			if (input1[index] == input2[index]) {
				flag = true;
			}
				else {
					flag = false;
					break;
				}
			}
		}
		
		else {
				flag = false;
		
			}
	
		if (flag == true)
			System.out.println ("Given Array is identical");
		else 
			System.out.println ("Given Array is not identical");
		
	}

		public static void main(String[] args) {
			Program_1 program_1 = new Program_1();
			int [] a = {10,12,55,32,17};
			int [] b = {10,12,55,32,17};
			program_1.arraysIdenticalOrNot(a, b);
			int [] c = {10,12,55,32,17,99};
			int [] d = {10,12,99,32,17};
			program_1.arraysIdenticalOrNot(c, d);
			int [] e = {10,12,55,32,17};
			int [] f = {10,12,99,32,17};
			program_1.arraysIdenticalOrNot(e, f);
			
		}
	

}
