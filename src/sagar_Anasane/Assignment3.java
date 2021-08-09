package sagar_Anasane;

class Assignment3{
	
	void findWeekdaysAndWeekends(int Day){
		if(Day >=1 && Day <= 5){
			System.out.println("Week Day");
		}else if(Day >= 6 && Day <= 7){	
			System.out.println("Weekend");
		}else
		{
			System.out.println("Invalid Index");
		}
	}
	
	void verifyBrowserName(String browser){
		if(browser.equals ("Chrome") || browser.equals ("IE") || browser.equals ("Edge")){
			System.out.println("Valid Browser");
		}else if (browser.equals("Safari") || browser.equals("Fire Fox")){
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] a){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysAndWeekends(3);
		assignment3.findWeekdaysAndWeekends(6);
		assignment3.findWeekdaysAndWeekends(-2);
		assignment3.findWeekdaysAndWeekends(11);
		assignment3.verifyBrowserName("Chrome");
		assignment3.verifyBrowserName("Fire Fox");
	}
	
	
}