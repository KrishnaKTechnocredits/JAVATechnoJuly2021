package umakant;
class Assignment2{
	
	void findWeekdaysAndWeekends(int dayIndex){
		if(dayIndex >= 1 && dayIndex <=5){
			System.out.println("Weekday");
		}
		else if(dayIndex >= 6 && dayIndex <=7){
			System.out.println("WeekEnd");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	void verifyBrowserName(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid browser");
		}
		else{
			System.out.println("Invalid browser");
		}
	}
	
	public static void main(String[] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.findWeekdaysAndWeekends(3);
		assignment2.findWeekdaysAndWeekends(6);
		assignment2.findWeekdaysAndWeekends(11);
		assignment2.findWeekdaysAndWeekends(-3);
		assignment2.verifyBrowserName("Chrome");
		assignment2.verifyBrowserName("Safari");
		assignment2.verifyBrowserName("FF");
		assignment2.verifyBrowserName("IE");
	}
}