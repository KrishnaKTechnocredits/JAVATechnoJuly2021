package suchita;

// Test 5

class Test5 {
	
	
	void getPerfectNumber(int input){
	 
		int count =0;
		int num = 1;
		int sum = 1;
		
		while (count <= input) {
			sum = 0;
			for(int index=1;index < num;index++) {
				if(num % index == 0)
					sum += index;
			}
			if(num == sum) {
				count++;
				System.out.println(num + " is a perfect number");
				
			}
			num++;
			} 
	}		
	
	
	public static void main(String[] args) {
		
		Test5 test = new Test5();
		test.getPerfectNumber(5);
		
	}
}