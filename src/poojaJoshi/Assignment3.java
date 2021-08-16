package poojaJoshi;

class Assignment3{
	
	void findWeekdaysAndWeekends(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekday");
		}
		else if(dayIndex>=6 && dayIndex<=7){
			System.out.println("Weekend");
		}
		else if (dayIndex>=7 || dayIndex <=1){
			System.out.println("Invalid Index");
		}
	}
	
	void verifyBrowserName(String browser){
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid Browser");
		}else {
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main (String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysAndWeekends(3);
		assignment3.findWeekdaysAndWeekends(6);
		assignment3.findWeekdaysAndWeekends(11);
		assignment3.findWeekdaysAndWeekends(-3);
		System.out.println("*******************	");
		assignment3.verifyBrowserName("Chrome");
		assignment3.verifyBrowserName("IE");
		assignment3.verifyBrowserName("Edge");
		assignment3.verifyBrowserName("Firefox");
		assignment3.verifyBrowserName("Safari");
		assignment3.verifyBrowserName("test");
	}
}