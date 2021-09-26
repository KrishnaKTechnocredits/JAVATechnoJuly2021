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
package sagar_Anasane;

public class Assignment27 {
	int cnt=0;
	int num=0;
	void arraysAreIdenticalOrNot(int a1[],int a2[]) {
		for (int index=0;index<a1.length;index++) {
			for (int nIndex =0;nIndex<a2.length;nIndex++) {
				if(a1[index]==a2[nIndex]) {
					cnt++;
				}
			}
			num++;
		}
		if(cnt==num) {
			System.out.println("Given Arrays are Identical"+"\n");
		}else {
			System.out.println("Given Arrays are not Identical"+"\n");
		}
	}	
	
	public static void main(String[] args) {
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		Assignment27 assignment27 = new Assignment27();
		assignment27.arraysAreIdenticalOrNot(arr1, arr2);
		assignment27.arraysAreIdenticalOrNot(arr3, arr4);
		assignment27.arraysAreIdenticalOrNot(arr5, arr6);
	}
}
