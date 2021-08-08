//Day - 3 : 3rd Aug'21
//assignment - 3

//Program 1: Find weekdays or weekend based on dayIndex.
//1 -> Monday
//2 -> Tuesday
//7 -> Sunday
//dayIndex -> 3 : Weekday
//dayIndex -> 6 : WeekEnd
//dayIndex -> 11 : Invalid Index
//dayIndex -> -3 : Invalid Index

//Program 2: Validate Browser name.
//Valid list : Chrome, IE, Edge --> Valid browser
//Safari, FF -> Invaild browser

//Note : score == 10
//String browser = "Chrome";
//Hint: browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")

package chaitanya;

class assignment3{
	
	void daysbyIndex(int index){
		
		if (index == 1 || index == 2 || index == 3 || index == 4 || index == 5 ){
			System.out.println("weekday");
		} else if (index == 6 || index == 7){
			System.out.println("weekend");
		} else {
			System.out.println("Invalid Index");
		}	
	}
	
	void browserName(String browser){
	    if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
	     System.out.println("Valid browser");
		} else if(browser.equals("Safari") || browser.equals("FF")) {
		  System.out.println("Invalid browser");
		} else {
		  System.out.println("Invalid browser");
		}
		  
	}

	public static void main (String[] args){
		assignment3 assignment3 = new assignment3();
		assignment3.daysbyIndex (1);
		assignment3.daysbyIndex (5);
		assignment3.daysbyIndex(6);
		assignment3.daysbyIndex(8);
		assignment3.daysbyIndex(-10);
		assignment3.browserName("Chrome");
		assignment3.browserName("Edge");
		assignment3.browserName("Safari");
		assignment3.browserName("Test");
	}	
}