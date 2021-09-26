package nidhi;

//find perfect number

class Assignment_31_Program1{
	
	void checkPerfect(int num){
		int sum=0;
		for (int i=1; i <num; i++){
			if (num%i == 0)
				sum = sum + i;
		}
		if (sum != num)
			System.out.println(num + " is not perfect number.");
		else
			System.out.println(num + " is perfect number.");
	}
	
	public static void main(String[] arg){
		Assignment_31_Program1 assignment31 = new Assignment_31_Program1();
		assignment31.checkPerfect(50);
		assignment31.checkPerfect(6);
		
	}

}