package dattaraj;

public class Assignment33_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,3,4,0,2,88,0,0,22,34};
        pushZerosToEnd(arr);
        System.out.println("Array after pushing zeros to the end: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
	}
	
	static void pushZerosToEnd(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
