package nidhi;
// reversing a number without converting it into string

class Assignment_30_Program1{
	
	
	int reverseNumber(int num){
		int revnum = 0;
		while (num > 0){
			int rim = num % 10; //121%10 = 12
			revnum = revnum * 10 + rim; // 12
			num = num/10; 
		}
		return revnum;
	}
	
	
	public static void main(String[] ar){
		Assignment_30_Program1 assignment30 = new Assignment_30_Program1();
		int input = 123454321;
		System.out.println(assignment30.reverseNumber(input));
		
	}
}