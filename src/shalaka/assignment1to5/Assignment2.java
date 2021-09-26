//Find weekdays and weekend based on dayIndex and validate browser name
package shalaka.assignment1to5;
class Assignment2{
	
	void findWeekdaysWeekends(int dayIndex){
		if(dayIndex<=7 && dayIndex>5){
			System.out.println("Weekends");
			
		}else if(dayIndex<=5 && dayIndex>=1){
			System.out.println("Weekdays");
		
		}else{
			System.out.println("Invalid Index");
		}
	}	
	void validateBrowser(String browser){
		if(browser.equals("Chrome")|| browser.equals("IE")|| browser.equals("Edge")){
			System.out.println("Valid Browser");
		}
		else if(browser.equals("Safari")|| browser.equals("FF")){
			System.out.println("Invalid Browser");
		}
	}
	public static void main(String [] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.findWeekdaysWeekends(5);
		assignment2.findWeekdaysWeekends(7);
		assignment2.findWeekdaysWeekends(-5);
		System.out.println("-------------------");
		assignment2.validateBrowser("Edge");
		assignment2.validateBrowser("Chrome");
		assignment2.validateBrowser("FF");
		assignment2.validateBrowser("Safari");
	}

}