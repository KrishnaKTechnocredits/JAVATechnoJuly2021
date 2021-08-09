package dattaraj;

class Assignment2{
	
	void findWeekdaysAndWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Its a Weekday");
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Its a WeekEnd");
		}else if(dayIndex<1 || dayIndex>7){
			System.out.println("Invalid Index");
		}
    }

    void  isValidBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println(browser+" is a Valid Browser");
		}else if(browser.equals("Safari") || browser.equals("FF")){
			System.out.println(browser+" is a InValid Browser");
		}
    }
	
	public static void main(String[] args){
		Assignment2 assign2 = new Assignment2();
		assign2.findWeekdaysAndWeekend(1);
		assign2.findWeekdaysAndWeekend(6);
		assign2.findWeekdaysAndWeekend(14);
		assign2.findWeekdaysAndWeekend(-8);
		assign2.isValidBrowser("Chrome");
		assign2.isValidBrowser("Safari");
	}	
}