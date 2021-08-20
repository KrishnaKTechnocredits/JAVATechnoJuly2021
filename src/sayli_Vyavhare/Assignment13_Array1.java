package sayli_Vyavhare;

public class Assignment13_Array1 {
	
	int [] input= {1,-11,0,0,55,0,-23,0};
	int count; 
	
	void countNumberOfZero() {
		
		 for(int index=0;index<input.length;index++){
			 if(input[index]==0)
				 count++;
			 }
		 System.out.println("Number of zero's : "+count);		
	}

	public static void main(String[] args) {
		
		Assignment13_Array1 assignment13_array1= new Assignment13_Array1();
		assignment13_array1.countNumberOfZero();
	}
}
