package akanksha_Jain;

public class Assignment_3{
	void findWeekdaysAndWeekends(int dayIndex){
		if (dayIndex > 0 && dayIndex <= 5){
			System.out.println("Weekday");
		} else if(dayIndex > 5 && dayIndex <= 7){
			System.out.println("Weekend");
		} else{
			System.out.println("Invalid index");
		}
	}

	void verifyBrowserName(String browserName){
		if (browserName.equals("Chrome") || browserName.equals("IE") || browserName.equals("Edge")){
			System.out.println("Valid Browser");
		} else {
			System.out.println("Invalid Browser");
		}
	}

	public static void main(String[] args){
		Assignment_3 week = new Assignment_3();
		Assignment_3 browser = new Assignment_3();
		week.findWeekdaysAndWeekends(3);
		week.findWeekdaysAndWeekends(6);
		week.findWeekdaysAndWeekends(11);
		week.findWeekdaysAndWeekends(-3);
		System.out.println("-------------------------------");
		browser.verifyBrowserName("Chrome");
		browser.verifyBrowserName("IE");
		browser.verifyBrowserName("Edge");
		browser.verifyBrowserName("Safari");
		browser.verifyBrowserName("FireFox");
		browser.verifyBrowserName("3");
	}
}