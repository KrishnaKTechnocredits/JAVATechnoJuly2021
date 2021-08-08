//Assignment 3 - 1. Find weekdays or weekend based on dayIndex. 2. Validate browser name

package sourabh;

class Assignment3{

	void checkWeekdayOrWeekend(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){
		System.out.println(dayIndex + " is Weekday");
		}
		else if(dayIndex == 6 || dayIndex == 7){
		System.out.println(dayIndex + " is Weekend");
		}
		else{
		System.out.println(dayIndex + " is invalid day");
		}	
	}
	
	void validateBrowser(String browser){
		if(browser.equals ("Chrome") || browser.equals ("Edge") || browser.equals ("IE")){
		System.out.println(browser + " is Valid Browser");
		}
		else{
		System.out.println(browser + " is Invalid Browser");
		}
	}	
		
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		System.out.println("\n");
		System.out.println( " ******** Output of Weekday AND Weekend ********");
		assignment3.checkWeekdayOrWeekend(1);
		assignment3.checkWeekdayOrWeekend(3);
		assignment3.checkWeekdayOrWeekend(5);
		assignment3.checkWeekdayOrWeekend(6);
		assignment3.checkWeekdayOrWeekend(0);
		assignment3.checkWeekdayOrWeekend(-1);
		System.out.println("\n");
		System.out.println( " ******** Output of Valid OR Invalid Browser ********");
		assignment3.validateBrowser("CHROME");  //check case sensitive
		assignment3.validateBrowser("IE");
		assignment3.validateBrowser("Edge");
		assignment3.validateBrowser("safari");	
	}
}