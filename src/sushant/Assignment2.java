package sushant;
class Assignment2{
	
	void findWeekdaysAndWeekend(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("Weekday");
		}else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Day");
		}
	}
	
	void isValidBrowser(String browser){
		if(browser.equals("Chrome")  || browser.equals("IE")  || browser.equals("Edge")){
			System.out.println("valid Browser");
		}else{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.findWeekdaysAndWeekend(3);
		assignment2.findWeekdaysAndWeekend(7);
		assignment2.findWeekdaysAndWeekend(8);
		assignment2.findWeekdaysAndWeekend(-2);
		assignment2.isValidBrowser("Chrome");
		assignment2.isValidBrowser("Safari");
		assignment2.isValidBrowser("IE");
		assignment2.isValidBrowser("Firefox");
		assignment2.isValidBrowser("Edge");
	}
}
			
