package shreya_codingtest_3;

import java.util.Scanner;

public class RemoveElement {
 void getElement(int[] arr,int element) {
	 int[] arr1=null;
	 for(int index=0;index<arr.length;index++){
		 if(arr[index]==element) {
			 arr1=new int[arr.length-1];
			 for(int index1=0;index1<index;index1++) {
				 arr1[index1]=arr[index1];
			 }
			 for(int index2=index;index2<arr.length-1;index2++) {
			 arr1[index2]=arr[index2+1];
			 }
			 break;
		 }
	}
	 System.out.println("New array: ");
	 for(int index3=0;index3<arr1.length;index3++) {
		 System.out.println(" "+arr1[index3]);
	 }
}
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] arr= {25,14,56,15,36,56,77,18,29,49};
		System.out.println("Element to be deleted");
		int element =scanner.nextInt();
		RemoveElement removeElement=new RemoveElement();
		removeElement.getElement(arr, element);
	}

}
