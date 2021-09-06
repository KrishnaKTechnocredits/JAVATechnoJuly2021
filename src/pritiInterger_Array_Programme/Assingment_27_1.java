package pritiInterger_Array_Programme;

public class Assingment_27_1 {
	void descideIdenticalArrayOrNot(int[] arr1, int [] arr2) {
		int lenarr1= arr1.length;
		int lenarr2= arr2.length;
		int cnt=0;
		int cnt1=0;
		if (lenarr1 !=lenarr2)
			System.out.println("Both Arrays are not identical and as their legth is not same.");
		else if (lenarr1 ==lenarr2){
			for (int index=0;index<arr1.length;index++) {
				for (int nIndex=0;nIndex<arr2.length;nIndex++) {
					if (arr1[index]==arr2[nIndex]) {
						cnt++;
					}else if (arr1[index]!=arr2[nIndex]) {
						cnt1++;
					}
				}
			}
		}
		if (cnt>=lenarr1) {
			System.out.println("Both Arrays have same length and same elements so they are identical.");
		}else if (cnt1>0) {
			System.out.println("Both the Arrays have same length but thier elements are different so they are not identical.");
		}
}					
	
	public static void main (String[] a) {
		Assingment_27_1 assingment_27_1= new Assingment_27_1();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		assingment_27_1.descideIdenticalArrayOrNot(arr1, arr2);
		int[] arr3 = {10,12,55,32,17};
		int[] arr4 = {10,12,99,32,17};
		assingment_27_1.descideIdenticalArrayOrNot(arr3, arr4);
		int[] arr5 = {10,12,55,32,17,99};
		int[] arr6 = {10,12,55,32,17};
		assingment_27_1.descideIdenticalArrayOrNot(arr5, arr6);
	}
}
/*WAP to find 2 arrays are identical or not. 
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

