package shreya;

class Assignment3{
	
	void displayDayNo(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("It's a weekday");
		}else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("It's a weekend");
		}else{
			System.out.println("It's a invalid index");
		}
	}
	
	void displayBrowserName(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("MS Edge")){
			System.out.println("Valid browser");
		}else if(browser.equals("Safari") || browser.equals("FF")){
			System.out.println("Invalid browser");
		}
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3 ();
		System.out.println("**Program to identify weekend and weekdays based on dayindex**");
		assignment3.displayDayNo(3);
		assignment3.displayDayNo(6);
		assignment3.displayDayNo(11);
		assignment3.displayDayNo(-3);
		System.out.println("**Program to validate a browser**");
		assignment3.displayBrowserName("Chrome");
		assignment3.displayBrowserName("FF");
		assignment3.displayBrowserName("IE");
	}
}