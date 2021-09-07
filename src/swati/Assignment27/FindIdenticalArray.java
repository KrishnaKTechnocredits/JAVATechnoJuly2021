package swati.Assignment27;

public class FindIdenticalArray {
	
	void findIdenticalOrNot(int[] arr1,int[] arr2) {
		boolean temp=false;
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]==arr2[index]) {
					temp=true;
				}
				else {
					temp=false;
					break;
				}
			}
		}else
			temp=false;
		
		if(temp)
			System.out.println("Identical");
		else
			System.out.println("Not Identical");		
		
	}
	
	public static void main(String[] a) {
		FindIdenticalArray findIdentical=new FindIdenticalArray();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		findIdentical.findIdenticalOrNot(arr1, arr2);
		int[] input1 = {10,12,55,32,17,99};
		int[] input2 = {10,12,55,32,17};
		findIdentical.findIdenticalOrNot(input1, input2);
		int[] array1 = {10,12,55,32,17};
		int[] array2 = {10,12,99,32,17};
		findIdentical.findIdenticalOrNot(array1, array2);
		 
	}

}
