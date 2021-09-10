package nidhi;
// reversing a number without converting it into string

class Assignment_30_Program3{
	
	
	void isArmstrongNumber(int input){
		int num = input;
		int size = 0;
		double Sum=0;
		while (num != 0){
			size = size +1;
			num = num / 10; 
		}

		num = input;
		while (num > 0){
			int rim = num % 10; //121%10 = 12
			Sum = Sum + Math.pow(rim, size);
			num = num/10; 
		}
		
		if (Sum == input)
			System.out.println(input + " is Armstrong");
		else
			System.out.println(input + " is not Armstrong");
	}
	
	public static void main(String[] ar){
		Assignment_30_Program3 assignment30 = new Assignment_30_Program3();
		int input = 153;
		assignment30.isArmstrongNumber(input);
		
	}
}