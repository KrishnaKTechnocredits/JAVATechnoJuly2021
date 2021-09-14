package dattaraj;

public class Assignment33_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-3,-2,11,44,55,-76,33,12};
		rearrange(arr);
		System.out.println("Array after rearrange : ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
	}
	
	static void rearrange(int arr[]){
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
