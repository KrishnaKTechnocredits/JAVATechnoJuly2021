package rushikesh.assign31;

public class Assign31_1 {

	void getTriplets(int [] input) {
		for(int index=0;index<input.length-2;index++){
			if(input[index]+1==input[index+1] && input[index+1]+1==input[index+2]) {
				System.out.println("Triplet are "+input[index]+" "+input[index+1]+" "+input[index+2]);
			}
		}
		
	}
				
	public static void main(String[] args) {
		Assign31_1 assign31_1=new Assign31_1();
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		assign31_1.getTriplets(input);
	}		 
			
}
			
	
