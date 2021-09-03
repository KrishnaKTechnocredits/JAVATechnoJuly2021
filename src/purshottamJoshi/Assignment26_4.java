package purshottamJoshi;

class Assignment26_4{
	
	void swapNumbersWithoutThird(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped Numbers : "+a+" , "+b);
	}
	public static void main(String[] args){
		Assignment26_4 assignment26_4 = new Assignment26_4();
		assignment26_4.swapNumbersWithoutThird(76,99);
	
	}
}