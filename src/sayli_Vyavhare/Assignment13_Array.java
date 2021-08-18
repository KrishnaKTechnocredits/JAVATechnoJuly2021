package sayli_Vyavhare;

public class Assignment13_Array {

	int[] input= {1,-11,-44,23,55,-99,-23,-22};
	int count;
	 void positiveCount() {
		 
		 for(int index=0;index<input.length;index++){
			 if(input[index]>0)
				 count++;
			 }
		 System.out.println("Number of positive count is: "+count);
	 }
	
	public static void main(String args[]) {
		
		Assignment13_Array assignment13_array=new Assignment13_Array();
		assignment13_array.positiveCount();
	}
}
