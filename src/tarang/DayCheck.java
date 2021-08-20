package tarang;


class DayCheck{
    
	void dayCount(int dayIndex){
	
		if(dayIndex >= 1 && dayIndex <= 5) {
		   System.out.println("Its a weekday");
		   
		}else if (dayIndex == 6 || dayIndex ==7) {
		   System.out.println("its a weekend");
		   
		}else {
		   System.out.println("Invalid index");
		}
	}
	
	//Validate Browser name
	
	void displayvalidBrowser(String browser){
		if(browser.equals("chrome") ||browser.equals("IE") || browser.equals("Edge"))
			System.out.println("\n This is valid browser");
		
	else if(browser.equals("safari") || browser.equals("FireFox"))
			System.out.println("\n This is invalid browser");
	}
			
	 public static void main(String [] args){
	   DayCheck dayCheck = new DayCheck();
	   dayCheck.dayCount(3);
	   dayCheck.dayCount(6);
	   dayCheck.dayCount(11);
	   dayCheck.dayCount(-3);
	   dayCheck.displayvalidBrowser("chrome");
	   dayCheck.displayvalidBrowser("safari");
	}
}