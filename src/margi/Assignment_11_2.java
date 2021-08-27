package margi;

class Assignment_11_2{
	
	//required numbers to generate sum more than 100
	int requiredNumber;
	void sum(int number){
		int sum = 0, num = 1;
		while(sum <= number){
			sum += num;
			num++;
			requiredNumber++;
		}
		System.out.println("Required numbers are: " + requiredNumber);
	}

	public static void main(String[] args){
		Assignment_11_2 reqNum = new Assignment_11_2();
		reqNum.sum(100);
	}
}