package tanmoy_Roy;
import tanmoy_Roy.Assignment14_1;
import tanmoy_Roy.Assignment14_2;


public class Assignment14_3 {
	int diffMinAndMaxElements(int[] array,int N) {
		Assignment14_1 assignment14_1= new Assignment14_1();
		Assignment14_2 assignment14_2= new Assignment14_2();
		 
		return assignment14_1.getMaxElement(array, N)-assignment14_2.getMinElement(array, N);
	}
	
	String arryToSinglelineString(int[] array,int N) {				//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++)
			str=str+String.valueOf(array[i])+" ";
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment14_3 assignment14= new Assignment14_3();
		int[] array1= {1,11,-44,23,55,99,23};
		System.out.println(assignment14.arryToSinglelineString(array1,7)+" array has "
				+assignment14.diffMinAndMaxElements(array1,7)+" as difference between Maximum and Minimum element");
		
		int[] array2= {1,-111,-44,-99,55,23};
		System.out.println(assignment14.arryToSinglelineString(array2,6)+" array has "
				+assignment14.diffMinAndMaxElements(array2,6)+" as difference between Maximum and Minimum element");
		
		
	}
}
