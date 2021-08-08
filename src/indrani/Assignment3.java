package indrani;
class Assignment3{  //To find whether the day is a weekday or a weekend and find the valid browser

    void findWeekdaysAndWeekends(int dayIndex){
	
	if(dayIndex >= 1 && dayIndex <= 5){
		System.out.println("Day number " + dayIndex + " : Its a weekday");
	}
	else if(dayIndex >= 6 && dayIndex <= 7){
		System.out.println("Day number "+ dayIndex + " : Its a weekend");
	}
	else if(dayIndex < 1 || dayIndex > 7){
		System.out.println("Day number "+ dayIndex + " : Its an invalid day");
	}
}

    void validBrowser(String browser){
	if(browser.equals ("IE") || browser.equals ("Chrome") || browser.equals ("Edge") ){
		System.out.println(browser + " : This is a valid browser");
	}
	else if(browser.equals ("Safari") || browser.equals ("FF")){
		System.out.println(browser + " : This is an invalid browser");
	}
	}
	
	public static void main(String []args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysAndWeekends(3);
		assignment3.findWeekdaysAndWeekends(6);
		assignment3.findWeekdaysAndWeekends(2);
		assignment3.findWeekdaysAndWeekends(-2);
		assignment3.findWeekdaysAndWeekends(0);
		assignment3.findWeekdaysAndWeekends(11);
		assignment3.validBrowser("Chrome");
		assignment3.validBrowser("FF");
		assignment3.validBrowser("Edge");
	}
}

	
