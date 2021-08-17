package nidhi;

class Assignment_15_program3{
	
	int diffPosNegNumber(int input[]){
		int sumEvenNbr=0;
		int sumOddNbr=0;
		int diffNbr = 0;
		
		for (int i=0; i < input.length ; i++){
			if (input[i] % 2 != 0){
				sumOddNbr += input[i];
			}else{
				sumEvenNbr += input[i];
			}
		}
		if (sumOddNbr > sumEvenNbr)
			diffNbr = sumOddNbr - sumEvenNbr;
		else
			diffNbr = sumEvenNbr - sumOddNbr;
		return diffNbr;
	}
	
	public static void main(String[] args){
		Assignment_15_program3 assignment15= new Assignment_15_program3();
		int[] arr = {13,22,10,3};
		System.out.println(assignment15.diffPosNegNumber(arr));
	}
}