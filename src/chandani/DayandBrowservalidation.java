package chandani;

//Assignment 3.1 and 3.2

class DayandBrowservalidation{
	
	//Display if the browser is valid or invalid
	void displayValidInvalid(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid Browser");
		}else if(browser.equals("Safari") || browser.equals("FF")){
			System.out.println("Invalid Browser");
		}else{
			System.out.println("Not Recognized");
		}
	}
	
	//Display if the day is a weekday or weekend
	void displayDay(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("Weekday");
		}else if(dayIndex > 5 && dayIndex < 8){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main (String[] args){
		DayandBrowservalidation dayandbrowservalidation = new DayandBrowservalidation();
		dayandbrowservalidation.displayValidInvalid("Chrome");
		dayandbrowservalidation.displayValidInvalid("IE");
		dayandbrowservalidation.displayValidInvalid("Edge");
		dayandbrowservalidation.displayValidInvalid("FF");
		dayandbrowservalidation.displayValidInvalid("Opera");
		dayandbrowservalidation.displayDay(3);
		dayandbrowservalidation.displayDay(6);
		dayandbrowservalidation.displayDay(11);
		dayandbrowservalidation.displayDay(-3);
	}
}