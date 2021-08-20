package tanmoy_Roy;

public class Assignment15_3 {
	
	int diffEvenAndOddElements(int[] array,int N) {
		int count=0;
		for(int i=0; i<N ;i++) {
			if( array[i]%2==0)
				count+=array[i];				//adding the count if array[i] element has even 
			else
				count-=array[i];				//substracting if the count if array[i] element has odd 
		}
		if(count<0)
			count*=-1;									//modulo
		return count;
		
	}
	
	String arryToSinglelineString(int[] array,int N) {				//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++)
			str=str+String.valueOf(array[i])+" ";
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment15_3 assignment15= new Assignment15_3();
		int[] array= {1,11,-44,23,55,99,23};
		System.out.println(assignment15.arryToSinglelineString(array,7)+" array has "
				+assignment15.diffEvenAndOddElements(array,7)+" as difference between Even and Odd Elements");
		
		int[] array1= {13,22,10,3};
		System.out.println(assignment15.arryToSinglelineString(array1,4)+" array has "
				+assignment15.diffEvenAndOddElements(array1,4)+" as difference between Even and Odd Elements");
	}

}
