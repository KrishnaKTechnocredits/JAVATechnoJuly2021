package purshottamJoshi;

class Assignment31_3{
	
	int count =0;
	void checkTripletSequence(int[] input)
	{
		int temp;
		for(int index=0 ;index<input.length-2;index++) {
			temp=input[index];
			if((temp+1)==input[index+1] && (2+temp)==input[index+2])
				count++;	
			}
		System.out.println("Count of Triplet in array : "+count);	
	}

	public static void main(String[] args) {
		Assignment31_3 assignment31_3 = new Assignment31_3();
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		assignment31_3.checkTripletSequence(input);
	}
}