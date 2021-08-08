package suchita;

class Assignment_6{

	void simpleInterest(int p,int t,int r){
		double s_interest=(p * t * r)/100;
		System.out.println("Simple Interest :: " + s_interest);
	}
	
	void tempConvert(int fah){
		int cel = (fah - 32)*5/9;
		System.out.println("Temperature in celsius :: " + cel);
	}
	
	public static void main(String[] args){
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(2500,7,30);
		assignment_6.tempConvert(120);
	}
}