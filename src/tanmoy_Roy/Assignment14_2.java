package tanmoy_Roy;

public class Assignment14_2 {
	
	int getMinElement(int[] array,int N) {
		int mid=N/2;															//traversing the arry from middle
		int min=array[mid]; 								
		for(int i=0;i<mid;i++) {
			if(array[mid-i-1]<=min)
				min=array[mid-i-1];
			if(array[mid+i]<=min)
				min=array[mid+i];
			
		}											//this will take care from a[0] to a[N-2] for odd elements
		
		if(N%2==1 && array[N-1]<=min)					//explicitly handling array[N-1] for odd elements only
			min=array[N-1];
		return min;
	}
	
	String arryToSinglelineString(int[] array,int N) {				//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++)
			str=str+String.valueOf(array[i])+" ";
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment14_2 assignment14=new Assignment14_2();
		int[] array1= {1,11,-44,23,55,99,23};
		System.out.println(assignment14.arryToSinglelineString(array1,7)+" array has " +assignment14.getMinElement(array1,7)+
				" as Minimum element");

		int[] array2= {1,-111,-44,-99,55,23};
		System.out.println(assignment14.arryToSinglelineString(array2,6)+" array has " +assignment14.getMinElement(array2,6)+
				" as Minimum element");
	}
}
