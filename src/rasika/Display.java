package rasika;

class Display{

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
		
		Display display = new Display();
		display.findWeekdaysAndWeekends(3);
		display.findWeekdaysAndWeekends(6);
		display.findWeekdaysAndWeekends(11);
		display.findWeekdaysAndWeekends(-3);
		
		display.verifyBrowserName("chrome");
		display.verifyBrowserName("safari");
	}
}