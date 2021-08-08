package shweta_Dharmadhikari;
class Assignment2{
	
	void findWeekdaysAndWeekend(int i){
			if( i<=5 && i>=1 ){
				System.out.println("Weekday");
			}else if( i==6 || i==7 ){
				System.out.println("Weekend");
			}else 
				System.out.println("Invalid Index");
	}
	
	void verifyBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid Browser");
		}else if(browser.equals("Safari") || browser.equals("FF")){
			System.out.println("Invalid Browser");}
	}
	
	public static void main(String[] args){
		Assignment2 assignment2 =new Assignment2();
		assignment2.findWeekdaysAndWeekend(1);
		assignment2.findWeekdaysAndWeekend(6);
		assignment2.findWeekdaysAndWeekend(8);
		assignment2.findWeekdaysAndWeekend(-2);
		System.out.println("     ");
		assignment2.verifyBrowser("Chrome");
		assignment2.verifyBrowser("IE");
		assignment2.verifyBrowser("FF");
	}	
}