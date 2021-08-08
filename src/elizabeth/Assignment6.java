package elizabeth;

class Assignment6{
	
	void simpleInterest(int principleAmt, float time, float rate){
		float simpleInterest=(principleAmt*time*rate)/100;
		System.out.println(simpleInterest);
	}
	
	void convertTemperature(float fahrenheit){
		float celsius=(fahrenheit - 32) * 5 / 9  ;
		System.out.println(celsius);
	}
	
	public static void main(String[] args){
		Assignment6 assignment6=new Assignment6();
		assignment6.simpleInterest(1000,60,50);
		assignment6.convertTemperature(101);
	}
}