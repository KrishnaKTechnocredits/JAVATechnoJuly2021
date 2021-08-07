package nishi;

public class Assignment_6 {

	public static void main(String[] args) {
		Assignment_6 assignment6 = new Assignment_6();
		assignment6.calSimpleInterest(1000,3,10);
		assignment6.convertTF(132);

	}
	
	void calSimpleInterest(double P,float T,float R) {
		double SI = (P*R*T)/100;
		System.out.println("Simple interest is "+SI);
	}
	
	void convertTF(float F)
	{
		float Celsius = (F - 32)*5/9;
		System.out.println("The temperature in celsius is "+Celsius);
	}

}
