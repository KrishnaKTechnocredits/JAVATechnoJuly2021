package swati.programmingTest;


public class Test8 {
	
	void dispayPairsCount(int[] input) {
		int totalPairs=0;
		int count=0;
		//boolean flag= false;
		for(int index=0;index<input.length;index++) {
			 if(input[index]!=0) {
				 count=1;
			for(int innIndex=index+1;innIndex<input.length;innIndex++) {
				if(input[index]==input[innIndex]) {
					count++;
					input[innIndex]=0;
				}
								
			}	
			totalPairs=totalPairs+(count/2);
			//input[index]=0;
		
			 }
		}
		System.out.println("Total pairs :"+totalPairs);
	}

	public static void main(String[] a) {
		Test8 t1=new Test8();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		t1.dispayPairsCount(input);
	}
}