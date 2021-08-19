package tanmoy_Roy;

public class Assignment13_1 {
	
	int countPositiveIntegers(int[] array,int N) {
		int count=0;
		int mid=N/2;								//traversing the arry from middle
		for(int i=0;i<mid;i++) {
			if(array[mid-i-1]>0)
				count++;
			if(array[mid+i]>0)
				count++;
		}											//this will take care from a[0] to a[N-2] for odd elements
		
		if(N%2==1 && array[N-1]>0)					//explicitly handling array[N-1] for odd elements only
			count++;
		return count;
	}
	
	
	String arryToSinglelineString(int[] array,int N) {				//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++)
			str=str+String.valueOf(array[i])+" ";
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment13_1 assignment13=new Assignment13_1();
		int[] array1= {1,-11,-44,23};
		
		System.out.println(assignment13.arryToSinglelineString(array1,4)+" array has " +assignment13.countPositiveIntegers(array1,4)+
				" Positive elements");
		
		int[] array2= {1,-11,-44,23,-99};
		System.out.println(assignment13.arryToSinglelineString(array2,5)+" array has " +assignment13.countPositiveIntegers(array2,5)+
				" Positive elements");
		
		
	}

}

