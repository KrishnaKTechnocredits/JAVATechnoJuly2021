package sneha;

class IntTemp{
	void interest(int p, int t, int r){
		int interest = (p * t * r)/100;
		System.out.println("Simple interest is " + interest);
	}
	
	void temperature(int x){
		int degree = (x - 32) * 5/9;
		System.out.println("Temperatur after converting from Fahrenheit to degree is " + degree);
	}
	
	public static void main(String[] a){
		IntTemp inttemp = new IntTemp();
		inttemp.interest(10000,2,7);
		inttemp.temperature(37);
	}
}