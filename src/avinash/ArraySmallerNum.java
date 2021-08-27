package avinash;

public class ArraySmallerNum {
	
	int printSmallernum(int num) {
		int[] arr = new int[5];
		for(int index=0;index<arr.length;index++) {
			num = num-1;
			arr[index]= num;
			System.out.print(arr[index]+",");
			
		}
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySmallerNum arraysmallernum = new ArraySmallerNum();
		arraysmallernum.printSmallernum(50);

	}

}
