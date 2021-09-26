package sayli_Vyavhare;

public class Assignment13_Array2 {
	
	 int[] smallerNumberOfgivenNumber(int num) {
		 
		int []output=new int[5];
		System.out.println(output.length+" numbers less than "+ num +" are ");
		for(int index=0;index<output.length;index++){
				num--;
				output[index]=num;
			 }
		
		return output;	
	}
	public static void main (String[] args) {
		
		Assignment13_Array2 assignment13_array2 =new Assignment13_Array2();
		int output[]=assignment13_array2.smallerNumberOfgivenNumber(50);	
		for (int index=0;index<output.length;index++){
			System.out.println(output[index]);
		}
	}
}
