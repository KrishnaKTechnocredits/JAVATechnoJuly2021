/* Assignment - 3  Day - 3 : 3rd Aug'21
Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index

Program 2: Validate Browser name.
Valid list : Chrome, IE, Edge --> Valid browser
Safari, FF -> Invaild browser

Note : score == 10
String browser = "Chrome";
*Hint: browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge") */

package arti_K;

class Test{

	void findWeekdaysAndWeekends(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5 ){
			System.out.println("Weekday");
		}else if(dayIndex == 6 || dayIndex == 7){
			System.out.println("WeekEnd");
		}else{
			System.out.println("Invalid Day");
		}
	}
	
	void verifyBrowserName(String browserName){
		if(browserName.equals("Chrome") || browserName.equals("IE") || browserName.equals("Edge")){
			System.out.println("Valid Browser");
		}else{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		Test test = new Test();
		test.findWeekdaysAndWeekends(3);
		test.findWeekdaysAndWeekends(6);
		test.findWeekdaysAndWeekends(11);
		test.findWeekdaysAndWeekends(-3);
		System.out.println("--------------------------------");
		test.verifyBrowserName("Chrome");
		test.verifyBrowserName("Safari");
		test.verifyBrowserName("IE");
		test.verifyBrowserName("Firefox");
		test.verifyBrowserName("Edge");
	}
	
}