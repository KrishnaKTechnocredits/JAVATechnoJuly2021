class Assignment3{
	void findWeekdaysandWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex<=6){
			System.out.println("Weekday");
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	void isValidBrowser(String browser){
		if(browser.equals("IE") || browser.equals("Chrome") || browser.equals("edge")){
			System.out.println("Valid Browser");
		}else if(browser.equals("Safari") || browser.equals("FireFox")){
			System.out.println("Invalid Browser"); 
		}
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysandWeekend(1);
		assignment3.isValidBrowser("IE");
		assignment3.findWeekdaysandWeekend(6);
		assignment3.isValidBrowser("FireFox");
	}
}