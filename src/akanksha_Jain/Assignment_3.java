/* Assignment - 3   3rd Aug'21
Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday   	2 -> Tuesday   	7 -> Sunday
dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
Program 2: Validate Browser name.
Valid list : Chrome, IE, Edge --> Valid browser
Safari, FF -> Invaild browser
Note : score == 10
String browser = "Chrome";
Hint: browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")
*/

package akanksha_Jain;

public class Assignment_3{
	void findWeekdaysAndWeekends(int dayIndex){
		if (dayIndex > 0 && dayIndex <= 5){
			System.out.println("Weekday");
		} else if(dayIndex > 5 && dayIndex <= 7){
			System.out.println("Weekend");
		} else{
			System.out.println("Invalid index");
		}
	}

	void verifyBrowserName(String browserName){
		if (browserName.equals("Chrome") || browserName.equals("IE") || browserName.equals("Edge")){
			System.out.println("Valid Browser");
		} else {
			System.out.println("Invalid Browser");
		}
	}

	public static void main(String[] args){
		Assignment_3 week = new Assignment_3();
		Assignment_3 browser = new Assignment_3();
		week.findWeekdaysAndWeekends(3);
		week.findWeekdaysAndWeekends(6);
		week.findWeekdaysAndWeekends(11);
		week.findWeekdaysAndWeekends(-3);
		System.out.println("-------------------------------");
		browser.verifyBrowserName("Chrome");
		browser.verifyBrowserName("IE");
		browser.verifyBrowserName("Edge");
		browser.verifyBrowserName("Safari");
		browser.verifyBrowserName("FireFox");
		browser.verifyBrowserName("3");
	}
}