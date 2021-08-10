package sagar_Gharge;


class Assignment6{

	void displayRateofInterest(int P, int T, int R){
	int displayRateofInterest = P*T*R/100;
	System.out.println ("Simple interest is  " + displayRateofInterest);
	}
	
	void displayTemprature (float T , float F){
	float displayTemprature = (F-32)*5/9;
	System.out.println ("Temprature in Celsius is " + displayTemprature);
		
		
	}
	public static void main (String []args){
	Assignment6 assignment6 = new Assignment6();
	assignment6.displayRateofInterest(10000,12,10);
	assignment6.displayTemprature(100,50);
	}
	
}