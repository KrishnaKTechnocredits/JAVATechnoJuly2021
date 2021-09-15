/* WAP to find 2 arrays are identical or not. 
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

package indrani;

public class Assignment_27 {
	
	void findArrayIdentical(int[] arr1,int[] arr2) {
		boolean flag=true;
		
		if(arr1.length!=arr2.length) {
			System.out.println("Arrays are not identical");
		}else {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]==arr2[index]) {
					continue;
				}else {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Arrays are identical");
			}
			else 
				System.out.println("Arrays are not identical");
		}
	}

	public static void main(String[] args) {
		Assignment_27 arrayidentical=new Assignment_27();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		arrayidentical.findArrayIdentical(arr1, arr2);
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		arrayidentical.findArrayIdentical(arr3, arr4);
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		arrayidentical.findArrayIdentical(arr5, arr6);
		

	}

}
