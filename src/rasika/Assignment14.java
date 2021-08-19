package rasika;

public class Assignment14 {

	int getMaxNumberFromnArray(int[] array) {
		int max = 0;
		for(int index =0; index < array.length; index++) {
			if(max < array[index]) {
				max = array[index];
			}
		}
		return max;	
	}
	int getMinNumberFromnArray(int[] array1) {
		int min = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] < min)
				min = array1[i];
		}
		return min;
	}
	int getDiffBetweenMaxOddAndMaxEvenNumber(int[] array) {
		int maxodd=0;
    	int maxeven=0;
    	for(int index=0;index<array.length;index++) {
    		if(array[index]%2==0) {
    			if(array[index]>maxeven) 
    				maxeven=array[index];
    			}else if(array[index]>maxodd) 
    				maxodd=array[index];
    		}
    		if(maxeven-maxodd>0) 
    			return maxeven-maxodd;
    		else 
    			return maxodd-maxeven;
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		int[] input = {1,11,44,23,55,99,23};
		System.out.println("Maximum number in array is "+assignment14.getMaxNumberFromnArray(input));
		System.out.println("Minimum number in array is "+assignment14.getMinNumberFromnArray(input));
		System.out.println("The difference between min and max num is "+(assignment14.getMaxNumberFromnArray(input) - assignment14.getMinNumberFromnArray(input)));
		System.out.println("The difference between Max Odd and Max Even+ num is  "+(assignment14.getDiffBetweenMaxOddAndMaxEvenNumber(input)));
}
}
