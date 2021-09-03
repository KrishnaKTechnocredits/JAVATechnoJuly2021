/*
Assignment - 27 : 2nd Sep'2021

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
output : Not Identical
*/
package bhakti;

public class Assignment_27 {
	
	
	void toIddentifyIdenticalArray(int[] ary1, int[] ary2) {
		boolean flag= false;
		if (ary1.length != ary2.length ) {
			System.out.println("Not identical: ");
		}else {
			for (int index=0; index< ary1.length; index++)
				if (ary1[index]!=ary2[index]) {
					flag = true;
					break;
			}
			if (flag==true) 
				System.out.println("Not identical");
			else 
				System.out.println("Identical");
			
		}
	
	}
	
	public static void main(String[] bn) {
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,99,32,17};
		
		Assignment_27 assignment_27_string= new Assignment_27(); 
		assignment_27_string.toIddentifyIdenticalArray(arr1, arr2);
		
		
	}

}

