package sayli_Vyavhare;

class Assignment6{
	
	void simpleInterest(int p,int t,int r){
		int si=p*t*r/100;
		System.out.println("Simple interest is:"+ si);		
	}
	
	void temperature(int f){
		int t=(f-32)*5/9;
		System.out.println("Temperature in celsius is:"+t);
	}

	public static void main (String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(5000,2,7);
		assignment6.temperature(200);
	}	
}
