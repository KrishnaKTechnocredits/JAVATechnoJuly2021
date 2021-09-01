package purshottamJoshi;

class Assignment26_3{
	int temp;
	void swapNumbers(int a, int b) {
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped Numbers using temp : "+a+" , "+b);
	}
	
	public static void main(String[] args){
		Assignment26_3 assignment26_3 = new Assignment26_3();
		assignment26_3.swapNumbers(10,20);
		assignment26_3.swapNumbers(56,78);
	}
}