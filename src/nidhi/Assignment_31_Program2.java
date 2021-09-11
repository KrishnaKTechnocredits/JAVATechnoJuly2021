package nidhi;

//find perfect square

class Assignment_31_Program2{
	
	void checkPerfectSqaure(int num){
		boolean sq = false;
		for (int i=1; i <=num/2; i++){
			if (i*i == num){
				sq = true;
				break;
			}
		}
		if (sq)
			System.out.println(num + " is perfect Square.");
		else
			System.out.println(num + " is not perfect Square.");
	}
	
	public static void main(String[] arg){
		Assignment_31_Program2 assignment31 = new Assignment_31_Program2();
		assignment31.checkPerfectSqaure(25);
		assignment31.checkPerfectSqaure(49);
		assignment31.checkPerfectSqaure(20);
		
	}

}