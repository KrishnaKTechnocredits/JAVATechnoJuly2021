package ashutosh;

class Assignment3{
	void weekdayOrWeekend(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5){
			System.out.println("Weekday");
		}else if(dayIndex == 6 ||dayIndex == 7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid day");
		}
	}
	
	void validBrowser(String browser){
		if(browser.equals("Firefox") || browser.equals("chrome") || browser.equals("IE")){
			System.out.println("Valid Browser");
		}else{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.weekdayOrWeekend(7);
		assignment3.weekdayOrWeekend(4);
		assignment3.weekdayOrWeekend(13);
		System.out.println("Valid or Invalid Browser");
		assignment3.validBrowser("Opera");
		assignment3.validBrowser("IE");
		assignment3.validBrowser("Chrome");
		assignment3.validBrowser("Safari");
	}
}