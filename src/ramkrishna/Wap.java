package ramkrishna;

public class Wap {
	
	void identicalArray(int[] arr1, int arr2[]) {

 		boolean flag=true;
 		if(arr1.length!=arr2.length)
 			System.out.println("Not identical");
 		else {
 			for(int index=0;index<arr1.length;index++) {
 				if(arr1[index]==arr2[index])
 					continue;
 				else
 					flag=false;
 				break;
 			}

 		if(flag)
 			System.out.println("Both arrays are Identical");
 		else
 			System.out.println("Both arrays are not identical");
 		}
 	}

 	public static void main(String[] args) {
 		Wap Wap=new Wap();

 		int[] arr1 = {10,12,55,32,17};
 		int[] arr2 = {10,12,55,32,17};
 		Wap.identicalArray(arr1, arr2);

 		int[] arr3 = {10,12,55,32,17,99};
 		int[] arr4 = {10,12,55,32,17};
 		Wap.identicalArray(arr3, arr4);

 		int[] arr5 = {10,12,55,32,17};
 		int[] arr6 = {10,12,99,32,17};
 		Wap.identicalArray(arr5, arr6);


 	}

}
