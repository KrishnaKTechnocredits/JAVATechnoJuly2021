package indrani;

public class Assignment6 {
	
	void simpleInterestCalculation(int principal,int time,double rate) {
		double SI=0;
		SI=(principal*time*rate)/100;
		System.out.println("The Simple interest is " + SI);
	}
    void temparatureConversion(double fahrenheit) {
    	double celsius=0;
    	celsius=(fahrenheit-32)*5/9;
    	System.out.println("The temparature conversion from fahrenheit to celsius is as : " + celsius);
    }
    public static void main(String[] args) {
    	Assignment6 assignment6 = new Assignment6();
    	assignment6.simpleInterestCalculation(10000,12,8.50);
    	assignment6.temparatureConversion(92);
    }
}
