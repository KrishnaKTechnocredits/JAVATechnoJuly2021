class Assignment3{
	void displayWeekdayOrWeekend(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("Weekday");
		}
		else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("Weekend");
		}
		else{
			System.out.println("Invalid");
		}
	}
	
	void checkBrowser(String browser){
		if(browser.equals("Chrome")||browser.equals("IE")||browser.equals("Edge")){
			System.out.println("Valid Browser");
		}
		else
			System.out.println("Invalid Browser");
	}
		
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		System.out.println("---------Day Check------------");
		assignment3.displayWeekdayOrWeekend(4);
		assignment3.displayWeekdayOrWeekend(7);
		assignment3.displayWeekdayOrWeekend(10);
		assignment3.displayWeekdayOrWeekend(-1);
		System.out.println("---------Browser Check------------");
		assignment3.checkBrowser("IE");
		assignment3.checkBrowser("Safari");
	}
}
