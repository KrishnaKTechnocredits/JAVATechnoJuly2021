package tanmoy_Sarkar;

public class WeekdayOrWeekends {
	String arr[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	void result(int dayCount){
		if(dayCount>=1 && dayCount<=5){
			System.out.println("Your entered day is : " +arr[dayCount-1]);
			System.out.println("weekday.");
		}
		else if(dayCount==6 || dayCount==7){
			System.out.println("Your entered day is : " +arr[dayCount-1]);
			System.out.println("weekend.");
		}
		else{
			System.out.println("Invalid Input.");
		}
	}
	void isValidBrowser(String browser){
		if (browser.equals("Chrome") || browser.equals("Edge") || browser.equals("IE")){
			System.out.println("Your browser is valid for the Exam.");
		}
		else{
			System.out.println("Please install Chrome or Edge or IE.");
		}
		System.out.println("Thank you.");
	}
	
	public static void main(String args[]){
		WeekdayOrWeekends weekdayorweekends = new WeekdayOrWeekends();
		weekdayorweekends.result(3);
		weekdayorweekends.result(6);
		weekdayorweekends.result(11);
		weekdayorweekends.result(-3);
		
	}

}
