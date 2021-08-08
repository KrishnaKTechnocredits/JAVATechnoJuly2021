package parthav;

//Assignment:  Find and print weekdays or weekends or Invalid index based on dayIndex value. 
// Requirements:  1-5 should print as Weekdays, 6 - 7 should print as Weekends, any other value should be printed as Invalid index

class DayCheck{
	void dayCount(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5){     // Condition to check for Weekdays 
			System.out.println("Its a weekday");
		}else if(dayIndex == 6 || dayIndex == 7){   // Condition to check for Weekends 
			System.out.println("Its a weekend");
		}else { 									// Condition to check for any other invalid value 
			System.out.println("Invalid index");
		}
	}
	
	public static void main(String [] args){
		DayCheck dayCheck = new DayCheck();
		dayCheck.dayCount(3);
		dayCheck.dayCount(6);
		dayCheck.dayCount(11);
		dayCheck.dayCount(-3);
	}
}