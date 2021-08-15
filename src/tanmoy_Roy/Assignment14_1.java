package tanmoy_Roy;

public class Assignment14_1 {
	
	int getMaxElement(int[] array,int N) {
		
		int mid=N/2;															//traversing the arry from middle
		int max=array[mid];       
		for(int i=0;i<mid;i++) {
			if(array[mid-i-1]>=max)
				max=array[mid-i-1];
			if(array[mid+i]>=max)
				max=array[mid+i];
		}																//this will take care from a[0] to a[N-2] for odd elements
		
		if(N%2==1 && array[N-1]>=max)									//explicitly handling array[N-1] for odd elements only
			max=array[N-1];
		return max;
	}
	
	String arryToSinglelineString(int[] array,int N) {					//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++)
			str=str+String.valueOf(array[i])+" ";
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment14_1 assignment14=new Assignment14_1();
		int[] array1= {1,11,-44,23,55,99,23};
		System.out.println(assignment14.arryToSinglelineString(array1,7)+" array has " +assignment14.getMaxElement(array1,7)+
				" as Maximum element");

		int[] array2= {1,11,-44,23,55,23};
		System.out.println(assignment14.arryToSinglelineString(array2,6)+" array has " +assignment14.getMaxElement(array2,6)+
				" as Maximum element");
	}
}
