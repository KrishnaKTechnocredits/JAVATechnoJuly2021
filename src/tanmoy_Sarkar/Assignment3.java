package tanmoy_Sarkar;

class Assignment3{
	String arr[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	void weekdayOrWeekends(int dayCount){
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
			System.out.println("Your " +browser+ " browser is valid for the Exam.");
		}
		else{
			System.out.println("Please install Chrome or Edge or IE.");
		}
		System.out.println("Thank you.");
	}
	public static void main(String args[]){
		Assignment3 assignment3 = new Assignment3();
		assignment3.weekdayOrWeekends(3);
		assignment3.weekdayOrWeekends(6);
		assignment3.weekdayOrWeekends(11);
		assignment3.weekdayOrWeekends(-3);
		System.out.println("******************************************");
		assignment3.isValidBrowser("Chrome");
		assignment3.isValidBrowser("Firefox");	
	}
}