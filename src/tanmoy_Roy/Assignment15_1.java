package tanmoy_Roy;

public class Assignment15_1 {
	
	int diffEvenAndOddLength(String[] array,int N) {
		int count=0;
		for(int i=0; i<N ;i++) {
			if( array[i].length()%2==0)
				count+=array[i].length();				//adding the count if array[i] element has even length
			else
				count-=array[i].length();				//substracting if the count if array[i] element has odd length
		}
		if(count<0)
			count*=-1;									//modulo
		return count;
		
	}
	
	String arryToSinglelineString(String[] array,int N) {				//Method to convert array to single line string
		String str=""; 
		for(int i=0;i<N;i++) {
			str=str+"\""+array[i]+"\"";
			if(i!=N-1)
				str+=",";
		}
		return "{"+str+ "}";
	}
	
	public static void main(String[] args) {
		Assignment15_1 assignment15= new Assignment15_1();
		String[] array = {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println(assignment15.arryToSinglelineString(array,4)+" array has "
				+assignment15.diffEvenAndOddLength(array,4)+" as difference between Maximum and Minimum length");

	}
}
	
