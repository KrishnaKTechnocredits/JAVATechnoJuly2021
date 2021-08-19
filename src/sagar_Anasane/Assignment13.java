package sagar_Anasane;

class Assignment13{ 
	int[] input1 = {1,-11,-44,23,55,-99,-23,-22};
	int[] input2 = {1,-11,0,0,55,0,-23,0};
	void positiveNoCount(){
		int cnt = 0;
		for(int index=0;index < input1.length;index++){
			if(input1[index] > 0){
				cnt = cnt + 1;
			}
		}	
		System.out.println(cnt);
	}
	
	void numberOfZeroes(){
		int cnt = 0;
		for (int index = 0; index<input2.length; index++){
			if(input2[index] == 0)
				cnt = cnt+1;
		}
		System.out.println(cnt);
	}
	
	int fiveSmallerNumber(int num){
		int [] Number = new int[5];
		for (int index = 0; index <5; index++){
			num --;
			System.out.println(num);
		}
		return num;
	}
	public static void main(String[] args){
		Assignment13 assignment13 = new Assignment13();
		System.out.println("Positive no Count :");
		assignment13.positiveNoCount();
		System.out.println("\n");
		System.out.println("Number of Zeroes :");
		assignment13.numberOfZeroes();
		System.out.println("\n");
		System.out.println("Five Smaller nos :");
		assignment13.fiveSmallerNumber(50);
	}	
}