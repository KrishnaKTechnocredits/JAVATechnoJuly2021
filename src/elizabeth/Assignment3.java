package elizabeth;

class Assignment3{

	void findWeekdaysAndWeekend(int dayIndex){
		
		if(dayIndex<=5 && dayIndex>=1){
			System.out.println("Weekday");
		}
		else if(dayIndex<=7 && dayIndex>=6){
			System.out.println("WeekEnd");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	void isValidBrowser(String browser){
		
		if(browser.equals("Chrome")||browser.equals("Edge")||browser.equals("IE")){
			System.out.println("Valid Browser");
		}
		else{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
	
		Assignment3 assignment3 =new Assignment3();
		assignment3.findWeekdaysAndWeekend(7);
		assignment3.findWeekdaysAndWeekend(3);
		assignment3.findWeekdaysAndWeekend(-3);
		assignment3.isValidBrowser("Safari");
		assignment3.isValidBrowser("Chrome");
		
	}
}