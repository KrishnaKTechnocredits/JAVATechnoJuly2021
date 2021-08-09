package rasika;

class Assignment2{

	void findWeekdaysAndWeekends(int dayIndex){
			if(dayIndex >= 1 && dayIndex <= 5){
				System.out.println("Its a Weekday");
			}
			else if (dayIndex >= 6 && dayIndex <= 7){
				System.out.println("yaaayy.....Its weekend");
			}
			else {
				System.out.println("Invalid Index");
			}
	}
	
	void verifyBrowserName(String name){
		
			if(name.equals("chrome") || name.equals("IE") || name.equals("Edge")) {
				System.out.println("Yes, Its a valid browser..");
			}
			else if(name.equals("safari") || name.equals("Firefox")){
				System.out.println("No..Its not valid browser..");
			}
	}
	
	public static void main(String[] args){
		
		Assignment2 assignment2 = new Assignment2();
		assignment2.findWeekdaysAndWeekends(3);
		assignment2.findWeekdaysAndWeekends(6);
		assignment2.findWeekdaysAndWeekends(11);
		assignment2.findWeekdaysAndWeekends(-3);
		System.out.println();
		assignment2.verifyBrowserName("chrome");
		assignment2.verifyBrowserName("safari");
	}
}