package kalpesh;

class Days{

	void findWeekdaysAndWeekends(int dayIndex){
		if (dayIndex >= 1 && dayIndex <= 5){
			System.out.println ("It is a weekday. ");
		}else if(dayIndex ==6 || dayIndex == 7){
			System.out.println ("It is a weekend. ");
		}else{
			System.out.println ("It is a invalid day ");
		}
	}
	
	void verifyBrowserName(String browser){
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("valid Broser:  ");
		}else { 
		    System.out.println(" invalid Broser ");  
		}
	}
	
	public static void main (String[] args){
		Days days = new Days();
		days.findWeekdaysAndWeekends(3);
		days.findWeekdaysAndWeekends(6);
		days.findWeekdaysAndWeekends(-2);
		System.out.println ("-----------------------------------------------");
		days.verifyBrowserName("Chrome");
		days.verifyBrowserName("IE");
		days.verifyBrowserName("Safari");
		days.verifyBrowserName("Edge");
		
	}
}