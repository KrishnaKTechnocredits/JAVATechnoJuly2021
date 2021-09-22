// WAP to find 2 arrays are identical or not 
package anuja_Assignment_27;

public class Prog1 {

	void identicalArrays(int[] arr1,int[] arr2) {
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					//continue;
					count++;
				}
			}
		}
		if(count==arr1.length && count==arr2.length)
			System.out.println("identical");
		else
			System.out.println("Not identical");
	}

	public static void main(String[] args) {
		Prog1 prog1=new Prog1();
		int[] arr1= {10,12,55,32,17};
		int[] arr2= {10,12,55,32,17};
		int[] arr3= {10,12,55,32,17,99};
		int[] arr4= {10,12,55,32,17};
		int[] arr5= {10,12,55,32,17};
		int[] arr6= {10,12,99,32,17};
		prog1.identicalArrays(arr1,arr2);
		prog1.identicalArrays(arr3,arr4);
		prog1.identicalArrays(arr5,arr6);
	}
}
