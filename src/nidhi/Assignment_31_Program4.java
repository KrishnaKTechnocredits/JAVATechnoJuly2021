package nidhi;

//find perfect number in range

class Assignment_31_Program4{
	
	boolean checkPerfect(int num){
		int sum=0;
		for (int i=1; i <num; i++){
			if (num%i == 0)
				sum = sum + i;
		}
		if (sum != num)
			return false;
		else
			return true;
	}
	
	void displayResult(int firstNum, int lastNum){
		for (int i=firstNum;i<=lastNum;i++){
			if (checkPerfect(i))
				System.out.println(i);
		}
	}
	
	public static void main(String[] arg){
		Assignment_31_Program4 assignment31 = new Assignment_31_Program4();
		assignment31.displayResult(1,50);
		
	}

}