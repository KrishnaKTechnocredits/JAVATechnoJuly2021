package ritabrata;

public class Assignment6{
	void Interest(int P, int T, int R) {
		int simpleInterest= (P*T*R)/100;// 'P' is INR, T is time in year, R is rate of interest per year
		System.out.println("Simple Interest= "+ simpleInterest +"rupees");
		
	}
	void Temperature(int farenheight) {
		int celcious= (farenheight-32)*5/9;
		System.out.println("Temperature is: "+ celcious + "degree Celcious");
	}
	public static void main(String[] args) {
		Assignment6 assignment6= new Assignment6();
		assignment6.Interest(10000, 2, 10);
		assignment6.Temperature(210);	
	}
}