package nasir_Assignment_27;

public class ArraysAreIdentical {
	
	void arraysCompare(int[] arr1,int[] arr2) {
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
				System.out.println("Arrays are identicals");
			}
			else 
				System.out.println("Arrays are not identical");
		}
	}

	public static void main(String[] args) {
		ArraysAreIdentical arraysAreIdentical=new ArraysAreIdentical();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		arraysAreIdentical.arraysCompare(arr1, arr2);
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		arraysAreIdentical.arraysCompare(arr3, arr4);
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		arraysAreIdentical.arraysCompare(arr5, arr6);
		

	}

}
