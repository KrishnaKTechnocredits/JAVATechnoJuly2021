package nidhi;

class Assignment_27{
	
	String compareArray(int[] arr1, int[] arr2){
		
		if (arr1.length != arr2.length){
			return "Non-Identical";
		} else {
			for (int i=0;i < arr1.length;i++){
				if (arr1[i] == arr2[i]){
					
				} else {
					return "Non-Identical";
					}
				
			}
		}
		return "Identical";
	}
	
	
	public static void main(String[] arg){
		Assignment_27 assignment27= new Assignment_27();
		int[] arr1 = {10,20,33,12,55,17};
		int[] arr2 = {10,20,30,12,55,17};
		
		int[] arr3 = {10,20,12,55,17};
		int[] arr4 = {10,20,30,12,55,17};
		
		int[] arr5 = {10,20,33,12,55,17};
		int[] arr6 = {10,20,33,12,55,17};
		
		System.out.println(assignment27.compareArray(arr1,arr2));
		System.out.println(assignment27.compareArray(arr3,arr4));
		System.out.println(assignment27.compareArray(arr5,arr6));
	}
}