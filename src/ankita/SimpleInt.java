package ankita;

public class SimpleInt {
	
	void calculate(int p,int t,int r)
	{
		int SI= p*t*r/100;
		System.out.println("Simple intrest is "+ SI);
		
	}
	void Temp(int F) {
		int celsius=(F-32)*5/9;
		System.out.println("Temperature is " + celsius);
	}
	public static void main(String[] args) {
		SimpleInt simpleint=new SimpleInt();
		simpleint.calculate(2000,6,9);
		simpleint.Temp(104);
	}
	
}
