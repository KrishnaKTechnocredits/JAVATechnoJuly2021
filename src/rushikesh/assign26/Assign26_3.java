package rushikesh.assign26;

public class Assign26_3 {
	int a=0;
	int b=0;
	int c=0;
	void getExchangeNum(int num1,int num2) {
		a=num1;
		b=num2;
		c=a;
		a=b;
		b=c;
		System.out.println("Values after Exchange "+a+" "+b);
		
	}
	
	public static void main(String[] args) {
		Assign26_3 assign26_3=new Assign26_3();
		assign26_3.getExchangeNum(10,20);
	}
}
