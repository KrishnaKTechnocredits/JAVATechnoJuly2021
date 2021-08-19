package suchita;

 class Program_3 {
	 
	int[] smallerNumbersOfGivenRange(int num) {
		int input[] = new int[5];
		int count=0;
		//int num=number;
		for(int index=num;index>num-5;num--){
			if(count != 5){
				input[count] = num-1;
			System.out.println(input[count]);
			count++;
		}	
		}
	
	return input;
	}
	
	public static void main(String[] args) {
		
		Program_3 assignment = new Program_3();
		System.out.println("\n Five smaller numbers of given number :: " );
		assignment.smallerNumbersOfGivenRange(50);
	}
	

}
